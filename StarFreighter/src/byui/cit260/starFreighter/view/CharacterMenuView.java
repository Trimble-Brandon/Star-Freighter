/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon
 */
public class CharacterMenuView extends View
{
    private final String captainText;
    
    public CharacterMenuView(Player player) 
    {
        super("\n"
                + "\n=========================================================="
                + "\n| Character Menu |                                       |"
                + "\n1 - Captain " + player.getName() + "                     |"
                + "\n                                                         |"
                + "\n==========================================================");
        
        this.captainText = "\nCaptain of the ship and the first crew member. As"
                         + "\n you gain experience you will be able to allocate"
                         + "\n skill points into classes to benefit your ship. ";
    }

    @Override
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "1":
                this.displayInfo(captainText);
                break;
        }
        
        return false;
    }
    
    private void displayInfo(String text) 
    {
        this.console.println(text);
        this.console.println("\n\nPress Enter to go back to the game menu");
        
        try {
            keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CharacterMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
