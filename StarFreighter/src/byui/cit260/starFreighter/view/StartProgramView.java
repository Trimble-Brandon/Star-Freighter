/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.GameControl;
import byui.cit260.starFreighter.exceptions.GameControlException;
import byui.cit260.starFreighter.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon
 */
public class StartProgramView extends View
{    
    private static String displayMessage;
    
    public StartProgramView() {
        super("\n*************************************************************"
             + "\n* This game you will be playing a newly dubbed captain.     *"
             + "\n* You have come into possession of a ship! Well, it used    *"
             + "\n* to be a ship. And it will be! Once you have acquired the  *"
             + "\n* parts and duct taped a few fractures in the hull, you     *"
             + "\n* are sure to be fine!                                      *"
             + "\n*                                                           *"
             + "\n* Thus we begin our adventure. You will first be            *"
             + "\n* seeking jobs to earn some currency to pay the necessary   *"
             + "\n* expenses. But, try to be honorable in your ventures, okay?*"
             + "\n* No funny business.                                        *"
             + "\n*                                                           *"
             + "\n* Of course you will be able to hone your own mediocre      *"
             + "\n* ..uhh..potential skills in areas of your choosing!        *"
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
             + "\n*                                                           *"
             + "\n*************************************************************"
             + "\n\n"
             + "\nPlease enter your name: ");
    }

    @Override
    public boolean doAction(String playerName) 
    {
        if (playerName.length() < 2)
        {
            this.console.println("\nInvalid Player name. The name must be greater than"
                            + " 1 characters in length.");
            this.console.println("\n\nPress enter to continue");
            try {
                keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        }
        
        Player player = null;
        try {
            player = GameControl.createPlayer(playerName);
        } catch (GameControlException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (player == null) {
            this.console.println("There was an error creating the player.");
            return false;
        }
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) 
    {
        this.console.println("\n================================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have fun!"
                         + "\n================================================="
                         );
        
        MainMenuView mainMenu = new MainMenuView();

        mainMenu.display();
    }
}
