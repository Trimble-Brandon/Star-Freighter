/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

import byui.cit260.starFreighter.exceptions.JobControlException;
import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.InventoryItem;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class JobControl 
{   
    public int calcCorrectDiff(int difficulty, int skill) throws JobControlException
    {
       //variables
       int cDiff = 0;
    
       if (difficulty < 1 || difficulty > 10 || skill < 1 || skill > 10)
       {
            throw new JobControlException("Error calculating corrected difficulty");
       }
       else
       {
           cDiff = difficulty + skill;
           
           if (cDiff <= 0)
           {
               return 1;
           }
           else
           {
               return cDiff;
           }
       }
    }
    
    public InventoryItem calcCurrencyReward(int cDiff)
    {
        //variables
        int cReward = 0;
        
        //calculation
        if (cDiff == 1)
        {
            cReward = 15;
        }
        else if (cDiff < 4)
        {
            cReward = 25;
        }
        else if (cDiff < 6)
        {
            cReward = 50;
        }
        else if (cDiff < 8)
        {
            cReward = 100;
        }
        else if (cDiff < 10)
        {
            cReward = 200;
        }
        else
        {
            cReward = 500;
        }
        
        return new InventoryItem("Money", cReward, "Currency", 0);
    }
    
    public InventoryItem calcItemReward(int cDiff)
    {
        //variables
        InventoryItem iReward = new InventoryItem();
        
        //calculation
        if (cDiff == 1)
        {
            iReward.setItemType("*Squirt gun*");
            iReward.setDescription("Powerfull pistol for the purpose of propelling a water jet");
            iReward.setItemSize(1);
        }
        else if (cDiff < 4)
        {
            iReward.setItemType("*Pistol*");
            iReward.setDescription("Small hand held projectile weapon");
            iReward.setItemSize(1);
        }
        else if (cDiff < 6)
        {
            iReward.setItemType("*Pistol & Sword*");
            iReward.setDescription("Small hand held projectile weapon and a clamour");
            iReward.setItemSize(3);
        }
        else if (cDiff < 8)
        {
            iReward.setItemType("*Rifle*");
            iReward.setDescription("Long range projectile weapon");
            iReward.setItemSize(2);
        }
        else if (cDiff < 10)
        {
            iReward.setItemType("*Hand Cannon*");
            iReward.setDescription("Powerful short range large projectile weapon");
            iReward.setItemSize(2);
        }
        else
        {
            iReward.setItemType("*Lightsaber ===|-----------*");
            iReward.setDescription("Awesomeness");
            iReward.setItemSize(3);
        }
        
        iReward.setQuantity(1);
        return iReward;
    }
    
    public int calcExpReward(int cDiff)
    {
        //variables
        int xpReward = 0;
        
        //calculations
        if (cDiff == 1)
        {
            xpReward = 5;
        }
        else if (cDiff < 4)
        {
            xpReward = 15;
        }
        else if (cDiff < 6)
        {
            xpReward = 30;
        }
        else if (cDiff < 8)
        {
            xpReward = 50;
        }
        else if (cDiff < 10)
        {
            xpReward = 100;
        }
        else
        {
            xpReward = 200;
        }
        
        return xpReward;
    }
    
    public void addGameTime(int amount) {
        Game curGame = StarFreighter.getCurrentGame();
        curGame.setTotalTime(curGame.getTotalTime() + amount);
    }
}
