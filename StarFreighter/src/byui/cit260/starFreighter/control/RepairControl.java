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
        if (skill < 1 || skill > 10 || 
            amountRepaired < 1 || amountRepaired > 100)
        {
            return -1;
        }
        else
        {
            return (int)Math.ceil((double)amountRepaired / skill);
        }
    }
}
