/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

import byui.cit260.starFreighter.model.Ship;

/**
 *
 * @author Joseph
 */
public class ShipControl {
    public int getCapacityAvailable(Ship ship, int inventoryUsed) {
        return ship.getMaxCapacity() - inventoryUsed;
    }
    
    public boolean increaseMaxCapacity(Ship ship, int amount) {
        if (ship.getMaxCapacity() > 399) {
            return false;
        } else {
            ship.setMaxCapacity(ship.getMaxCapacity() + amount);
            return true;
        }
    }
    
    public boolean repairEngine(Ship ship, int amount) {
        if (ship.getEngine() != 100) {
            ship.setEngine(ship.getEngine() + amount);
            if (ship.getEngine() > 100) {
                ship.setEngine(100);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean repairHull(Ship ship, int amount) {
        if (ship.getHull() != 100) {
            ship.setHull(ship.getHull() + amount);
            if (ship.getHull() > 100) {
                ship.setHull(100);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean repairElectrical(Ship ship, int amount) {
        if (ship.getElectrical() != 100) {
            ship.setElectrical(ship.getElectrical() + amount);
            if (ship.getElectrical() > 100) {
                ship.setElectrical(100);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean repairLifeSupport(Ship ship, int amount) {
        if (ship.getLifeSupport()!= 100) {
            ship.setLifeSupport(ship.getLifeSupport() + amount);
            if (ship.getLifeSupport() > 100) {
                ship.setLifeSupport(100);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean useFuel(Ship ship, int amount) {
        if (amount <= ship.getFuelLevel()) {
            ship.setFuelLevel(ship.getFuelLevel() - amount);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean refuel(Ship ship, int amount) {
        if (amount > (ship.getMaxCapacity() - ship.getFuelLevel())) {
            return false;
        } else {
            ship.setFuelLevel(ship.getFuelLevel() + amount);
            return true;
        }
    }
}
