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
class GameMenuView 
{

    void displayMenu() 
    {
        LaunchShipView launchShip = new LaunchShipView();
        String value = "";
        
        System.out.println("displayMenu called!");
        
        System.out.println("Test Launch Ship? (y/n): ");
        
        Scanner keyboard = new Scanner(System.in);
        value = keyboard.nextLine();
        
        if (value == "y")
        {
            launchShip.displayLaunch();
        }   
    }
    
}
