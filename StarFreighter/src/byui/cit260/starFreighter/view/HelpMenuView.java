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

        this.infoText = "\nInfo Yay!";
        this.movementText = "\nMovement Yay!";
        this.captainText = "\nCaptain Yay!";
        this.incomeText = "\nIncome Yay!";
        this.shipText = "\nShip Yay!";
        this.shopsText = "\nShops Yay!";
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
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
    private void displayInfo(String text) 
    {
        System.out.println(text);
        System.out.println("\n\nPress Enter to go to help menu");
        
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
}
