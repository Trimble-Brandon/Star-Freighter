/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.GameControl;
import byui.cit260.starFreighter.model.InventoryItem;

/**
 *
 * @author Brandon
 */
class GameMenuView extends View
{    
    public GameMenuView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Game Menu Options |                                    |"
                + "\nL - Change Location/Launch Ship!                         |"
                + "\nM - see your map!                                        |" 
                + "\nS - enter the Shop and see repairs/upgrades              |"
                + "\nJ - view the Job board                                   |" 
                + "\nI - view your Inventory                                  |"
                + "\nC - the Character Menu                                   |"
                + "\nQ - view main menu                                       |"
                + "\n---------------------------------------------------------|");
    }
     
     public boolean doAction(String value) {
        switch(value) {
            case "L":
                LocationChooserView lChooser = new LocationChooserView();
                lChooser.display();
                break;
            case "M":
                System.out.println("Placeholder for Map");
                break;
            case "S":
                ShopMenuView sMenu = new ShopMenuView();
                sMenu.display();
                break;
            case "J":
                System.out.println("Placeholder for Job board");
                break;
            case "I":
                System.out.println("Placeholder for Inventory view");
                this.displayInventory();
                break;
            case "C":
                System.out.println("Placeholder for Character menu view");
            case "N":
                return true;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }

    private void displayInventory() 
    {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items!");
        this.console.println("Description" + "\t" +
                           "Required" + "\t" +
                           "In Stock");
        
        for (InventoryItem item : inventory) {
	this.console.println(item.getDescription() + "\t   " +
                     item.getQuantity() + "\t   ");
        }   
    }
}
