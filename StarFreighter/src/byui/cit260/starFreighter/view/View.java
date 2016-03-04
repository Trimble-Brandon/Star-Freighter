/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override 
    public void display() {
        boolean done = false;
        do {
            String value = this.getInput();
            if(value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        }
        while (!done);
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while(!valid) {
            System.out.println("\n" + this.displayMessage);
            value = keyboard.nextLine().toUpperCase();
            value = value.trim();
            
            if(value.length() < 1) {
                System.out.println("What you have entered is invalid."
                                 + "\nPlease try again");
                continue;
            }
            break;
        }
        return value;
    }
}
