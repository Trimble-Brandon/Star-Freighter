/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brandon
 */
public class RepairControlTest 
{
    
    public RepairControlTest() 
    {
        
    }

    /**
     * Test of calcTimeToComplete method, of class RepairControl.
     */
    @Test
    public void testCalcTimeToComplete() 
    {
        System.out.println("calcTimeToComplete");
        Integer skill = 2;
        Integer amountRepaired = 7;
        RepairControl instance = new RepairControl();
        Integer result = instance.calcTimeToComplete(skill, amountRepaired);
    
        System.out.println(skill + ", " + amountRepaired + ", " + result);
    }
    
}
