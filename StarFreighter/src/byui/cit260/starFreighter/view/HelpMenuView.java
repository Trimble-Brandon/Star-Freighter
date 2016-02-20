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
public class HelpMenuView {
    private final String menu;
    private final String infoText;
    private final String movementText;
    private final String captainText;
    private final String incomeText;
    private final String shipText;
    private final String shopsText;
    
    public HelpMenuView() {
        this.menu = "\n"
                    + "\n--------------------------------------------------------------"
                    + "\n| Help Menu                                                  |"
                    + "\nG - Info                                                     |"
                    + "\nM - Movement - How to move                                   |"
                    + "\nC - Captain and Crew - Classes/Roles/Skills                  |"
                    + "\nI - How to Make Money/Jobs Board                             |"
                    + "\nD - Ship Details - Launch and travel                         |"
                    + "\nR - Shops Upgrades and Repairs                               |"
                    + "\nQ - Back to previous menu                                    |"
                    + "\n--------------------------------------------------------------";

        this.infoText = "\nInfo Yay!";
        this.movementText = "\nMovement Yay!";
        this.captainText = "\nCaptain Yay!";
        this.incomeText = "\nIncome Yay!";
        this.shipText = "\nShip Yay!";
        this.shopsText = "\nShops Yay!";
    }
    
    public void displayMenu() 
    {
        boolean done = false;
        do {
            System.out.println(menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    public String getMenuOption() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
        boolean valid = false;
        while(!valid)
        {
            System.out.println("Select menu item");
            value = keyboard.nextLine().toUpperCase();
            value = value.trim();
            
            if(value.length() < 1)
            {
                System.out.println("What you have entered is invalid."
                        + "\nPlease try again");
                continue;
            }
            valid = true;
        }
        return value;
    }

    private boolean doAction(String menuOption) 
    {
        switch(menuOption)
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
    
    private void displayInfo(String text) {
        System.out.println(text);
        System.out.println("\n\nPress Enter to go to help menu");
        
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }
}
