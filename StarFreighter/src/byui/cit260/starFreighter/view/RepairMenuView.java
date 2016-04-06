/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.view;

import byui.cit260.starFreighter.control.RepairControl;
import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.InventoryItem;
import byui.cit260.starFreighter.model.Player;
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
        int cost = 0;
        int time = 0;
        int skill = 0;
        int repaired = 0;
        Player player = curGame.getPlayer();
        InventoryItem mon = curGame.getInventory().get(0);
        switch(value)
        {
            case "1":
                cur = ship.getHull();
                repaired = rc.calcRepair(ship.getHull());
                skill = player.getHullSkill();
                time = rc.calcTimeToComplete(skill, repaired);
                cost = rc.calcCost(time, skill, repaired);
                if (cost <= mon.getQuantity()) {
                    if(cur != 100) {
                        ship.setHull(cur + rc.calcRepair(cur));
                        console.println("Ship's hull is now at " + ship.getHull() + "%");
                    } else {
                        console.println("Ship's hull is already at 100%");
                    }
                } else {
                    console.println("You don't have enough money to complete this repair");
                }
                break;
            case "2":
                cur = ship.getElectrical();
                repaired = rc.calcRepair(ship.getElectrical());
                skill = player.getElectricalSkill();
                time = rc.calcTimeToComplete(skill, repaired);
                cost = rc.calcCost(time, skill, repaired);
                if (cost <= mon.getQuantity()) {
                    if(cur != 100) {
                        ship.setElectrical(cur + rc.calcRepair(cur));
                        console.println("Ship's electrical system is now at " + ship.getElectrical()+ "%");
                    } else {
                        console.println("Ship's electrical system is already at 100%");
                    }
                } else {
                    console.println("You don't have enough money to complete this repair");
                }
                break;
            case "3":
                cur = ship.getLifeSupport();
                repaired = rc.calcRepair(ship.getLifeSupport());
                skill = player.getLifeSupportSkill();
                time = rc.calcTimeToComplete(skill, repaired);
                cost = rc.calcCost(time, skill, repaired);
                if (cost <= mon.getQuantity()) {
                    if(cur != 100) {
                        ship.setLifeSupport(cur + rc.calcRepair(cur));
                        console.println("Ship's life support system is now at " + ship.getLifeSupport() + "%");
                    } else {
                        console.println("Ship's life support system is already at 100%");
                    }
                } else {
                    console.println("You don't have enough money to complete this repair");
                }
                break;
            case "4":
                cur = ship.getEngine();
                repaired = rc.calcRepair(ship.getEngine());
                skill = player.getMechanicalSkill();
                time = rc.calcTimeToComplete(skill, repaired);
                cost = rc.calcCost(time, skill, repaired);
                if (cost <= mon.getQuantity()) {
                    if(cur != 100) {
                        ship.setEngine(cur + rc.calcRepair(cur));
                        console.println("Ship's engine is now at " + ship.getEngine() + "%");
                    } else {
                        console.println("Ship's engine is already at 100%");
                    }
                } else {
                    console.println("You don't have enough money to complete this repair");
                }
                break;
            default:
                this.console.println("Invalid selection. Please try again.");
        }
        return false;
    }
}
