/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.GameControl;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class MainMenuView extends View 
{
    
    public MainMenuView() 
    {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Main Menu                                                  |"
            + "\nN - Start New game                                           |"
            + "\nG - Start Existing game                                      |"
            + "\nH - Get help on how to play the game                         |"
            + "\nS - Save game                                                |"
            + "\nQ - Exit                                                     |"
            + "\n--------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        switch(value) {
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

    private void startNewGame() {
        GameControl.newGame(StarFreighter.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame has been called.");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displaySaveMenu() {
        SaveMenuView saveMenu = new SaveMenuView();
        saveMenu.display();
        System.out.println("saveGame has been called.");
    }
    
}
