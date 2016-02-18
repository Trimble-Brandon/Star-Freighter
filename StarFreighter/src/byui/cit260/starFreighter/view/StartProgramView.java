/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.GameControl;
import byui.cit260.starFreighter.model.Player;
import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class StartProgramView 
{
    private String promptMessage;
    
    public StartProgramView() 
    {
        this.promptMessage = "\nPlease enter your name: ";
    
        this.displayBanner();
        
        String playerName = this.getPlayerName();
        
        Player player = GameControl.createPlayer(playerName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        
        mainMenu.displayMenu();
    
    }

    public void displayBanner() 
    {
        System.out.println(
               "\n*************************************************************"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*                                                           *"
             + "\n*************************************************************"
             );
    }

    public void displayStartProgramView() 
    {
        boolean done = false;
        do 
        {
            String playerName = this.getPlayerName();
            if(playerName.toUpperCase().equals("Q"))
            {
                return;
            }
            done = this.doAction(playerName);
        }
        while (!done);
    }

    public String getPlayerName() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        
        boolean valid = false;
        while(!valid)
        {
            System.out.println(this.promptMessage);
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

    private boolean doAction(String playerName) 
    {
        if (playerName.length() < 2)
        {
            System.out.println("\nInvalid Player name. The name must be greater than"
                    + "1 characters in length.");
            
            return false;
        }
        Player player = GameControl.createPlayer(playerName);
        if(player == null)
        {
            System.out.println("There was an error creating the player.");
            
            return false;
        }
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) 
    {
        
        
        MainMenuView mainMenu = new MainMenuView();
                
        MainMenuView.displayMainMenuView();
    }

    private void displayWelcomeMessage(Player player) 
    {
        System.out.println("\n================================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have fun!"
                         + "\n================================================="
                         );
    }
    
    
    
}
