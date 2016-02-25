/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.util.Scanner;

/**
 *
 * @author Brandon
 */
class GameMenuView 
{
    private final String menu;
    
    public GameMenuView()
    {
        this.menu = "\nTesting LaunchShipView. Would you like to launch?(y/n): ";
    }
    
     public void displayMenu() 
    {
        boolean done = false;
        do {
            System.out.println(menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) 
            {
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
            System.out.println("(y/n)");
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
            case "Y":
                LaunchShipView launchShip = new LaunchShipView();
                launchShip.displayLaunch();
                break;
            case "N":
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMainMenuView();
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
}
