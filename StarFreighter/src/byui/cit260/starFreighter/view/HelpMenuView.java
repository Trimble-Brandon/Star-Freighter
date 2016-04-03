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
 * @author Joseph
 */
public class HelpMenuView extends View
{
    private final String infoText;
    private final String movementText;
    private final String captainText;
    private final String incomeText;
    private final String shipText;
    private final String shopsText;
    
    public HelpMenuView() 
    {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Help Menu                                                  |"
            + "\nG - Info                                                     |"
            + "\nM - Movement - How to move                                   |"
            + "\nC - Captain and Crew - Classes/Roles/Skills                  |"
            + "\nI - How to Make Money/Jobs Board                             |"
            + "\nD - Ship Details - Launch and travel                         |"
            + "\nR - Shops Upgrades and Repairs                               |"
            + "\nQ - Back to previous menu                                    |"
            + "\n--------------------------------------------------------------");

        this.infoText = "\nStarFreighter is a game where you will act as the "
                      + "\nship captain. You have just gotten a ship and need "
                      + "\nto get it repaired and spaceworthy. You will take "
                      + "\njobs to make money and recruit crew to develop skills"
                      + "\n to fulfill roles on your ship.";
        
        this.movementText = "\nMovement will be based on locations that you "
                          + "\nselect. Jobs will be based in locations. When "
                          + "\nthe ship is repaired this is how you will launch"
                          + "\n the ship into space.";
        
        this.captainText = "\nYou are the acting captain, having acquired this "
                         + "\nship. You will gain experience and fulfill a role"
                         + "\n of your choosing that will benefit your ship and"
                         + "\n crew. Lead wisely!";
        
        this.incomeText = "\nYou will gain your income through jobs completed. "
                        + "\nIncome is used to hire crew, obtain upgrades, "
                        + "\nmaintain your ship through repairs, and purchase "
                        + "\nitems.";
        
        this.shipText = "\n\"Wherever we want to go, we'll go. That's what a "
                      + "\nship is, you know. It's not just a keel and a hull "
                      + "\nand a deck and sails, that's what a ship needs but "
                      + "\nwhat a ship is... what a ship really is... is freedom.\"";
        
        this.shopsText = "\nThe shops present you with wares to improve upon "
                       + "\nyour ship and provide much needed repairs for damages. "
                       + "\nNo duct tape I'm afraid...";
    }

    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "G":
                this.displayInfo(infoText);
                break;
            case "M":
                this.displayInfo(movementText);
                break;
            case "C":
                this.displayInfo(captainText);
                break;
            case "I":
                this.displayInfo(incomeText);
                break;
            case "D":
                this.displayInfo(shipText);
                break;
            case "R":
                this.displayInfo(shopsText);
                break;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
    private void displayInfo(String text) 
    {
        this.console.println(text);
        this.console.println("\n\nPress Enter to go to help menu");
        
        
        try {
            keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(HelpMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
