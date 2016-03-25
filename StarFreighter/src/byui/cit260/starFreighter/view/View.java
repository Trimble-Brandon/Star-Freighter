/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import starfreighter.StarFreighter;

/**
 *
 * @author Joseph
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = StarFreighter.getInFile();
    protected final PrintWriter console = StarFreighter.getOutFile();
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override 
    public void display() {
        String value;
        boolean done = false;
        do {
            value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        }
        while (!done);
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        try {
            while(!valid) {
                this.console.println("\n" + this.displayMessage);
                value = this.keyboard.readLine().toUpperCase();
                value = value.trim();

                if(value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "What you have entered is invalid."
                                     + "\nPlease try again");
                    continue;
                }
                break;
            }
        } catch(Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return value;
    }
}
