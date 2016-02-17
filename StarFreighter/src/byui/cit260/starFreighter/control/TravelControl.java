/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

/**
 *
 * @author Joseph
 */
public class TravelControl {
    public int calcTime(int skill, int upgrades, int distance) {
        if (skill > 10 || skill < 0 || upgrades > 10 || upgrades < 0 || distance < 1) {
            return - 1;
        } else {
            int time = distance - (skill + upgrades);
            if (time < 0) {
                return 0;
            } else {
                return time;
            }
        }        
    }
}
