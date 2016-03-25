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
        super("\nTesting LocationChooserView, ShopMenuView. "
                + "\nEnter L for LocationChooserView, "
                + "\nEnter S for ShopMenuView, "
                + "\nEnter D for DisplayInventory, "
                + "\nEnter N to return ");
    }
     
     public boolean doAction(String value) {
        switch(value) {
            case "L":
                LocationChooserView lChooser = new LocationChooserView();
                lChooser.display();
                break;
            case "S":
                ShopMenuView sMenu = new ShopMenuView();
                sMenu.display();
                break;
            case "D":
                this.displayInventory();
                break;
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
