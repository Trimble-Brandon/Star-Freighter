/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.model.Location;
import byui.cit260.starFreighter.model.Map;

/**
 *
 * @author Joseph
 */
public class LocationChooserView extends View {    
    public LocationChooserView() {
        super("\n**************************************************************"
            + "\n* Choose a location to travel to.                            *"
            + "\n*                                                            *"
            + "\n* 1 - Downtown                                               *"
            + "\n* 2 - Slums                                                  *"
            + "\n* 3 - Machine shop                                           *"
            + "\n* 4 - Fuel station                                           *"
            + "\n* 5 - Public house                                           *"
            + "\n* 6 - Reqruiting office                                      *"
            + "\n* 7 - Park                                                   *"
            + "\n* 8 - 6 Flags                                                *"
            + "\n* 9 - Walmart                                                *"
            + "\n* 10- Launch Ship!                                           *"
            + "\n* Q - Exit                                                   *"
            + "\n**************************************************************");
    }
    @Override
    public boolean doAction(String value) {
        Location loc = new Location();
        Map map = new Map();
        switch(value) {
            case "1":
                loc.setDescription("");
                loc.setLocation(1);
                loc.setLocationName("Downtown");
                map.setLocation(loc);
                return true;
            case "2":
                loc.setDescription("");
                loc.setLocation(2);
                loc.setLocationName("Slums");
                map.setLocation(loc);
                return true;
            case "3":
                loc.setDescription("");
                loc.setLocation(3);
                loc.setLocationName("Machine shop");
                map.setLocation(loc);
                return true;
            case "4":
                loc.setDescription("");
                loc.setLocation(4);
                loc.setLocationName("Fuel station");
                map.setLocation(loc);
                return true;
            case "5":
                loc.setDescription("");
                loc.setLocation(5);
                loc.setLocationName("Public house");
                map.setLocation(loc);
                return true;
            case "6":
                loc.setDescription("");
                loc.setLocation(6);
                loc.setLocationName("Reqruiting office");
                map.setLocation(loc);
                return true;
            case "7":
                loc.setDescription("");
                loc.setLocation(7);
                loc.setLocationName("Park");
                map.setLocation(loc);
                return true;
            case "8":
                loc.setDescription("");
                loc.setLocation(8);
                loc.setLocationName("6 Flags");
                map.setLocation(loc);
                return true;
            case "9":
                loc.setDescription("");
                loc.setLocation(9);
                loc.setLocationName("Walmart");
                map.setLocation(loc);
                return true;
            case "10":
                loc.setDescription("Launch the Ship!");
                loc.setLocation(10);
                loc.setLocationName("Launch Ship");
                map.setLocation(loc);
                LaunchShipView.promptMessage();
                return true;
            case "Q":
                return true;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
