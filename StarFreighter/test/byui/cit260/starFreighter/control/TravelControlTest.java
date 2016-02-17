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
 * @author nieminen
 */
public class TravelControlTest {
    
    public TravelControlTest() {
    }

    /**
     * Test of calcTime method, of class TravelControl.
     */
    @Test
    public void testCalcTime() {
        System.out.println("calcTime");
        int skill = 10;
        int upgrades = 10;
        int distance = 30;
        TravelControl instance = new TravelControl();
        int expResult = 10;
        int result = instance.calcTime(skill, upgrades, distance);
        System.out.println(result + " -> " + expResult);
    }
    
}
