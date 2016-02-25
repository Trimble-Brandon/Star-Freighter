/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class LaunchShipView 
{
    private String promptMessage;
    private final String menu;
    
    public LaunchShipView() 
    {   
        this.menu = "\n********************************************************"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                  insert of rocket launch                 *"
              + "\n*                           coming                         *"
              + "\n*                            soon                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n*                                                          *"
              + "\n************************************************************";
    }
    
    public void displayLaunch()
    {
        this.promptMessage = "\nWould you like to prep ship for launch?(y/n): ";
        
        boolean done = false;
        do {
            System.out.println(menu);
            String menuOption = this.getLaunchPermission();
            if (menuOption.toUpperCase().equals("Q")) 
            {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }    
    
    public String getLaunchPermission() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid)
        {
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1)
            {
                System.out.println("Invalid value! The value cannot be blank.");
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
