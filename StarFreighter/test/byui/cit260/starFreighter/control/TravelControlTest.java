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
        int skill = 2;
        int upgrades = 2;
        int distance = 7;
        TravelControl instance = new TravelControl();
        int expResult = 3;
        int result = instance.calcTime(skill, upgrades, distance);
        System.out.println(result + " -> " + expResult);
        
        skill = -7;
        upgrades = 4;
        distance = 7;
        expResult = -1;
        result = instance.calcTime(skill, upgrades, distance);
        System.out.println("\n" + result + " -> " + expResult);
        
        skill = 5;
        upgrades = 6;
        distance = -4;
        expResult = -1;
        result = instance.calcTime(skill, upgrades, distance);
        System.out.println("\n" + result + " -> " + expResult);
        
        skill = 11;
        upgrades = -1;
        distance = -98;
        expResult = -1;
        result = instance.calcTime(skill, upgrades, distance);
        System.out.println("\n" + result + " -> " + expResult);
        
        skill = 1;
        upgrades = 10;
        distance = 25;
        expResult = 14;
        result = instance.calcTime(skill, upgrades, distance);
        System.out.println("\n" + result + " -> " + expResult);
        
        skill = 10;
        upgrades = 0;
        distance = 1;
        expResult = 0;
        result = instance.calcTime(skill, upgrades, distance);
        System.out.println("\n" + result + " -> " + expResult);
        
        skill = 10;
        upgrades = 10;
        distance = 30;
        expResult = 10;
        result = instance.calcTime(skill, upgrades, distance);
        System.out.println("\n" + result + " -> " + expResult);
    }
    
}
