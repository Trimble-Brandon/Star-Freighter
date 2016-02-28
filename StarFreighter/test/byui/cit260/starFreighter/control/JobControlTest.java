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
public class JobControlTest 
{
    
    public JobControlTest() 
    {
        
    }

    /**
     * Test of calcCorrectDiff method, of class JobControl.
     */
    @Test
    public void testCalcCorrectDiff() 
    {
        System.out.println("calcCorrectDiff");
        int difficulty = 10;
        int skill = 6;
        JobControl instance = new JobControl();
        int result = instance.calcCorrectDiff(difficulty, skill);
        
        System.out.println(difficulty + ", " + skill + ", " + result);
    }

    /**
     * Test of calcCurrencyReward method, of class JobControl.
     */
    @Test
    public void testCalcCurrencyReward() 
    {
        System.out.println("calcCurrencyReward");
        int cDiff = 4;
        JobControl instance = new JobControl();
        int result = instance.calcCurrencyReward(cDiff);
        
        System.out.println(cDiff + ", Congratulations! You have been awarded "
                            + result + " currency!");
    }

    /**
     * Test of calcItemReward method, of class JobControl.
     */
    @Test
    public void testCalcItemReward() 
    {
        System.out.println("calcItemReward");
        int cDiff = 4;
        JobControl instance = new JobControl();
        String result = instance.calcItemReward(cDiff);
        
        System.out.println(cDiff + ", Congratulations! You have received loot: "
                            + result);
    }

    /**
     * Test of calcExpReward method, of class JobControl.
     */
    @Test
    public void testCalcExpReward() 
    {
        System.out.println("calcExpReward");
        int cDiff = 4;
        JobControl instance = new JobControl();
        int result = instance.calcExpReward(cDiff);
        
        System.out.println(cDiff + ", You have gained " + result + " experience points!");
    }
}

