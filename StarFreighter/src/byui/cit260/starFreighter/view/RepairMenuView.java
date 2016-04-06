/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.RepairControl;
import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.Ship;
import starfreighter.StarFreighter;

/**
 *
 * @author Joseph
 */
public class RepairMenuView extends View {
    public RepairMenuView() {
        super("\n**************************************************************"
            + "\n* Choose which part of the ship to repair                    *"
            + "\n*                                                            *"
            + "\n* 1 - Hull/Body                                              *"
            + "\n* 2 - Electrical                                             *"
            + "\n* 3 - Life support                                           *"
            + "\n* 4 - engine                                                 *"
            + "\n* Q - back to shop menu                                      *"
            + "\n**************************************************************");
    }
    
    @Override
    public boolean doAction(String value) {
        Game curGame = StarFreighter.getCurrentGame();
        Ship ship = curGame.getShip();
        RepairControl rc = new RepairControl();
        int cur = 0;
        switch(value)
        {
            case "1":
                cur = ship.getHull();
                if(cur != 100) {
                    ship.setHull(cur + rc.calcRepair(cur));
                    console.println("Ship's hull is now at " + ship.getHull() + "%");
                } else {
                    console.println("Ship's hull is already at 100%");
                }
                break;
            case "2":
                cur = ship.getElectrical();
                if(cur != 100) {
                    ship.setElectrical(cur + rc.calcRepair(cur));
                    console.println("Ship's electrical system is now at " + ship.getElectrical()+ "%");
                } else {
                    console.println("Ship's electrical system is already at 100%");
                }
                break;
            case "3":
                cur = ship.getLifeSupport();
                if(cur != 100) {
                    ship.setLifeSupport(cur + rc.calcRepair(cur));
                    console.println("Ship's life support system is now at " + ship.getLifeSupport() + "%");
                } else {
                    console.println("Ship's life support system is already at 100%");
                }
                break;
            case "4":
                cur = ship.getEngine();
                if(cur != 100) {
                    ship.setEngine(cur + rc.calcRepair(cur));
                    console.println("Ship's engine is now at " + ship.getEngine() + "%");
                } else {
                    console.println("Ship's engine is already at 100%");
                }
                break;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
