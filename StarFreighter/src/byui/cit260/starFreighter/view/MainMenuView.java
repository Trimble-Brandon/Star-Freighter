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
    private final String MENU = "\n"
            + "\n--------------------------------------------------------------"
            + "\n| Main Menu                                                  |"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------------------------------";
    
    static void displayMainMenuView() 
    {
        
    }

    void displayMenu() 
    {
        char selection = ' ';
        do
        {
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }
        while (selection != 'E');
    }
    
    public String getInput() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
        boolean valid = false;
        while(!valid)
        {
            System.out.println("Select menu item");
            value = keyboard.nextLine();
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

    private void doAction(char choice) 
    {
        switch(choice)
        {
            case 'N': 
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }
    }

    private void startNewGame() 
    {
        GameControl.newGame(StarFreighter.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame has been called.");
    }

    private void displayHelpMenu() 
    {
        System.out.println("displayHelpMenu has been called.");
    }

    private void saveGame() 
    {
        System.out.println("saveGame has been called.");
    }
    
}
