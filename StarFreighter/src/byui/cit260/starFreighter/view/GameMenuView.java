/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.GameControl;
import byui.cit260.starFreighter.model.InventoryItem;
import java.util.List;

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
            case "S":
                ShopMenuView sMenu = new ShopMenuView();
                sMenu.display();
                break;
            case "J":
                JobBoardView jBoard = new JobBoardView();
                jBoard.display();
                break;
            case "I":
                this.displayInventory();
                break;
            case "C":
                CharacterMenuView cMenu = new CharacterMenuView(player);
                cMenu.display();
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
        List<InventoryItem> inventoryList = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items!");
        this.console.println("Description" + "\t" +
                           "Required" + "\t");
        
        for (InventoryItem item : inventoryList) {
            this.console.println(item.getItemType() + "\t   " +
                     item.getQuantity() + "\t   ");
        }   
    }
}
