/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon
 */
public class SaveMenuView extends View
{
    private final String saveGameText;
    private final String loadGameText;
    private final String quit2MainText;
    
    public SaveMenuView() 
    {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Save Menu                                                  |"
            + "\nS - Save game                                                |"
            + "\nL - Load game                                                |"
            + "\nQ - Quit to main menu                                        |"
            + "\n--------------------------------------------------------------");

        this.saveGameText = "\nSave game has been called";
        this.loadGameText = "\nLoad game has been called";
        this.quit2MainText = "\nQuit to main menu has been called";
    }

    
    @Override
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "S":
                this.displayInfo(saveGameText);
                break;
            case "L":
                this.displayInfo(loadGameText);
                break;
            case "Q":
                this.displayInfo(quit2MainText);
                return true;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
    private void displayInfo(String text) 
    {
        this.console.println(text);
        this.console.println("\n\nPress Enter to go back to the save menu");
        
        try {
            keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SaveMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
}
