/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

import byui.cit260.starFreighter.model.Location;
import byui.cit260.starFreighter.model.Map;

/**
 *
 * @author Joseph
 */
public class MapControl {

    static Map createNewMap() {
        System.out.println("createNewMap has been called!");
        return null;
    }

    static void moveActorsToStartingLocation(Map map) {
        
        
    }
    public boolean move(Map map, Location loc) {
        if (map.getLocation() == loc) {
            return false;
        } else {
            map.setLocation(loc);
            return true;
        }
    }
    
    public boolean validLocation(Location loc) {
        if (loc.getDescription() != "" && loc.getLocationName() != "" && loc.getLocation() < 10 && loc.getLocation() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
