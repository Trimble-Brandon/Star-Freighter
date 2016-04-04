/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

import byui.cit260.starFreighter.model.InventoryItem;
import java.util.List;
import starfreighter.StarFreighter;


/**
 *
 * @author Joseph
 */
public class InventoryControl 
{
    public void addToInventory(InventoryItem newItem) {
        boolean exists = false;
        List<InventoryItem> inventory = StarFreighter.getCurrentGame().getInventory();
        for (InventoryItem inv : inventory) {
            if(inv.getItemType().equals(newItem.getItemType())) {
                exists = true;
                inv.setQuantity(inv.getQuantity() + newItem.getQuantity());
                break;
            }
        }
        if (!exists) {
            inventory.add(newItem);
        }
    }
    
    public void removeFromInventory(String itemName, int quantity) {
        List<InventoryItem> inventory = StarFreighter.getCurrentGame().getInventory();
        for (InventoryItem inv : inventory) {
            if(inv.getItemType().equals(itemName)) {
                inv.setQuantity(inv.getQuantity() - quantity);
                if (inv.getQuantity() < 0) {
                    inv.setQuantity(0);
                }
                break;
            }
        }
    }
}
