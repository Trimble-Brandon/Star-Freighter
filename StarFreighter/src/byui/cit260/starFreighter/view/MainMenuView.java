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
                this.saveGame();
                break;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.newGame(StarFreighter.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        //SaveMenuView saveMenu = new SaveMenuView();
        //saveMenu.display();
        
        this.console.println("\n\nEnter the file path where you want the game to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(StarFreighter.getCurrentGame(), filePath);
        } catch(Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
        
        //Display successful save
    }
    
}
