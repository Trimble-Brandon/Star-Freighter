/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

/**
 *
 * @author Brandon
 */
public class RepairControl 
{
    public int calcTimeToComplete(int skill, int amountRepaired) 
    {
        if (skill < 1 || skill > 10 || amountRepaired < 1 || amountRepaired > 100) 
        {
            return -1;
        } else 
        {
            return (int)Math.ceil((double)amountRepaired / skill);
        }
    }
    
    public int calcRepair(int currentAmount) 
    {
        switch(currentAmount) {
            case 0:
                return 30;
            case 30:
                return 25;
            case 55:
                return 20;
            case 75:
                return 15;
            case 90:
                return 10;
            default:
                return -1;
        }
    }
    
    
    public int calcExperience(int timeToComplete, int skill, int amountRepaired) 
    {
        return timeToComplete + amountRepaired + skill;
    }
    
    
    public int calcCost(int timeToComplete, int skill, int amountRepaired) 
    {
        return timeToComplete + amountRepaired - skill;
    }
}
