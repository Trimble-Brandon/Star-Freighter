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
    }

    public void displayBanner() 
    {
        System.out.println(
               "\n*************************************************************"
             + "\n* This game you will be playing a newly dubbed captain. You *"
             + "\n* have come into possession of a ship! Well, it used to be a*"
             + "\n* ship. And it will be! Once you have acquired the parts and*"
             + "\n* duct taped a few fractures in the hull, you are sure to be*"
             + "\n* fine!                                                     *"
             + "\n*                                                           *"
             + "\n* Thus we begin our adventure. You will first be            *"
             + "\n* seeking jobs to earn some currency to pay the necessary   *"
             + "\n* expenses. But, try to be honorable in your ventures, okay?*"
             + "\n* No funny business.                                        *"
             + "\n*                                                           *"
             + "\n* Of course you will be able to hone your own mediocre      *"
             + "\n* …uhh…potential skills in areas of your choosing!         *"
             + "\n*                                                           *"
             + "\n* Do you want to be a pilot? The mechanic?                  *"
             + "\n*                                                           *"
             + "\n* Perhaps you are good to kill for a quarter? No? I am      *"
             + "\n* sure a fat, but happy crew is a grateful one with your    *"
             + "\n* fancy cakes and steaks.                                   *"
             + "\n*                                                           *"
             + "\n* You will have the choice of roles to fill on your ship    *"
             + "\n* but be careful as you can only hire four crew members     *"
             + "\n* and some roles may be more important than others. These   *"
             + "\n* roles will affect the future capabilities of your ship    *"
             + "\n* and effectiveness as a crew. Your end goal is to get      *"
             + "\n* ship in the air. Who knows, perhaps there is more meant   *"
             + "\n* for you......                                             *"
             + "\n*                                                           *"
             + "\n*               out there..among the stars....              *"
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

    private boolean doAction(String playerName) 
    {
        if (playerName.length() < 2)
        {
            System.out.println("\nInvalid Player name. The name must be greater than"
                    + "1 characters in length.");
            
            return false;
        }
        
        Player player = GameControl.createPlayer(playerName);
        if (player == null)
        {
            System.out.println("There was an error creating the player.");
            return false;
        }
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) 
    {
        System.out.println("\n================================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have fun!"
                         + "\n================================================="
                         );
        
        MainMenuView mainMenu = new MainMenuView();

        mainMenu.displayMainMenuView();
    }
}
