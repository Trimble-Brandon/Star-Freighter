/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon
 */
public class ShopMenuView extends View
{    
    public int getPistolSupply()
    {
        String pistols[] = {"RedPistol", "FlintPistol", "BBPistol"}; //placeholder until we've got the inventory set up
        int pistolSupply = 0;
        int count = 0;
        
        for (int i = 0; i < pistols.length - 1; i++)
        {
            count++;
        }
        pistolSupply = count;
            
        
        return pistolSupply;
    }
    
    public ShopMenuView() 
    {
        super("\n"
            + "\n--------------------------------------------------------------"
            + "\n| Shop Menu                                                  |"
            + "\n1 - Food                                                 *50 |"
            + "\n2 - Ammunition                                           *20 |"
            + "\n3 - Medical Supplies                                     *35 |"
            + "\n4 - Flintlock Pistol                                    *100 |"
            + "\nR - Repair and upgrades menu                                 |"   
            + "\nQ - Quit to game menu                                        |"
            + "\n--------------------------------------------------------------");
    }

    
    @Override
    public boolean doAction(String value) 
    {
        switch(value)
        {
            case "1":
                //this.displayInfo(foodText);
                break;
            case "2":
                //this.displayInfo(ammoText);
                break;
            case "3":
                //this.displayInfo(medText);
                break;
            case "4":
                //this.displayInfo(pistolText);
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
