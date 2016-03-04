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
class GameMenuView extends View
{    
    public GameMenuView()
    {
        super("\nTesting LaunchShipView. Would you like to launch?(y/n): ");
    }
     
     public boolean doAction(String value) 
    {
        switch(value)
        {
            case "Y":
                LaunchShipView launchShip = new LaunchShipView();
                launchShip.display();
                break;
            case "N":
                return true;
            default:
                System.out.println("Invalid selection. Please try again.");
        }
        return false;
    }
    
}
