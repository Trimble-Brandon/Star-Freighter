/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.GameControl;
import java.util.Scanner;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class MainMenuView 
{
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                    + "\n--------------------------------------------------------------"
                    + "\n| Main Menu                                                  |"
                    + "\nN - Start New game                                           |"
                    + "\nG - Start Existing game                                      |"
                    + "\nH - Get help on how to play the game                         |"
                    + "\nS - Save game                                                |"
                    + "\nE - Exit                                                     |"
                    + "\n--------------------------------------------------------------";
    }
    
    public void displayMainMenuView() 
    {
        boolean done = false;
        do {
            System.out.println(menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) {
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
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.displaySaveMenu();
                break;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }

    private void startNewGame() 
    {
        GameControl.newGame(StarFreighter.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() 
    {
        System.out.println("startExistingGame has been called.");
    }

    private void displayHelpMenu() 
    {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void displaySaveMenu() 
    {
        SaveMenuView saveMenu = new SaveMenuView();
        saveMenu.displayMenu();
        System.out.println("saveGame has been called.");
    }
    
}
