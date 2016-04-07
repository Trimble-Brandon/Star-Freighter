/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.InventoryControl;
import byui.cit260.starFreighter.model.InventoryItem;
import byui.cit260.starFreighter.model.Ship;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class ShopMenuView extends View
{    
    public ShopMenuView() 
    {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Shop Menu                                                  |"
            + "\n1 - Food                                                 *50 |"
            + "\n2 - Ammunition                                           *20 |"
            + "\n3 - Medical Supplies                                     *35 |"
            + "\n4 - Flintlock Pistol                                    *100 |"
            + "\n5 - Fuel                                                *200 |"
            + "\nR - Repair and upgrades menu                                 |"   
            + "\nQ - Quit to game menu                                        |"
            + "\n--------------------------------------------------------------");
    }

    
    @Override
    public boolean doAction(String value) {
        int cost = 0;
        InventoryItem item = null;
        InventoryItem mon = StarFreighter.getCurrentGame().getInventory().get(0);
        InventoryControl ic = new InventoryControl();
        switch(value)
        {
            case "1":
                cost = 50;
                item = new InventoryItem("Food", 1, "Stuff you eat", 1);
                if (mon.getQuantity() >= cost) {
                    ic.addToInventory(item);
                    ic.removeFromInventory("Money", cost);
                    console.println("You purchased " + item.getItemType() + ", and have $" + mon.getQuantity() + " left.");
                } else {
                    console.println("You do not have enough money");
                }
                break;
            case "2":
                cost = 20;
                item = new InventoryItem("Ammunition", 1, "Stuff shoot with", 1);
                if (mon.getQuantity() >= cost) {
                    ic.addToInventory(item);
                    ic.removeFromInventory("Money", cost);
                    console.println("You purchased " + item.getItemType() + ", and have $" + mon.getQuantity() + " left.");
                } else {
                    console.println("You do not have enough money");
                }
                break;
            case "3":
                cost = 35;
                item = new InventoryItem("Medical Supplies", 1, "Stuff heal with", 1);
                if (mon.getQuantity() >= cost) {
                    ic.addToInventory(item);
                    ic.removeFromInventory("Money", cost);
                    console.println("You purchased " + item.getItemType() + ", and have $" + mon.getQuantity() + " left.");
                } else {
                    console.println("You do not have enough money");
                }
                break;
            case "4":
                cost = 100;
                item = new InventoryItem("Flintlock Pistol", 1, "Thing that shoots the stuff you shoot with", 2);
                if (mon.getQuantity() >= cost) {
                    ic.addToInventory(item);
                    ic.removeFromInventory("Money", cost);
                    console.println("You purchased " + item.getItemType() + ", and have $" + mon.getQuantity() + " left.");
                } else {
                    console.println("You do not have enough money");
                }
                break;
            case "5":
                cost = 200;
                if (mon.getQuantity() >= cost) {
                    Ship ship = StarFreighter.getCurrentGame().getShip();
                    ship.setFuelLevel(ship.getFuelLevel() + 10);
                    ic.removeFromInventory("Money", cost);
                    console.println("You purchased " + item.getItemType() + ", and have $" + mon.getQuantity() + " left.");
                } else {
                    console.println("You do not have enough money");
                }
                break;
            case "R":
                RepairMenuView repair = new RepairMenuView();
                repair.display();
                break;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
