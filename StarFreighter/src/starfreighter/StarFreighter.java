/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starfreighter;

import byui.cit260.starFreighter.model.*;

/**
 *
 * @author Joseph
 */
public class StarFreighter 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Game Object test
        Game game = new Game();
        
        game.setNoPeople(1);
        game.setTotalTime(0.00);
        String gameInfo = game.toString();
        
        System.out.println(gameInfo);
        
        //Map Object test
        Map map = new Map();
        
        map.setLocation("Paradise!");
        String mapInfo = map.toString();
        
        System.out.println(mapInfo);
        
        //Ship Object test
        Ship ship = new Ship();
        
        ship.setDescription("Ship stuff");
        ship.setElectrical(12);
        ship.setEngine(35);
        ship.setFuelLevel(84);
        ship.setHull(45);
        ship.setLifeSupport(76);
        ship.setMaxCapacity(7000);
        
        String shipInfo = ship.toString();
        System.out.println(shipInfo);
        
        //InventoryItem Object test
        InventoryItem item = new InventoryItem();
        
        item.setDescription("Corn");
        item.setItemSize(1);
        item.setItemType("Perishable");
        item.setQuantity(48);
        
        String itemInfo = item.toString();
        System.out.println(itemInfo);
        
        //Job Object test
        Job job = new Job();
        
        job.setCurrencyReward(112.74);
        job.setDescription("Wash Dishes");
        job.setDifficulty(1);
        job.setItemReward("Spanner");
        
        String jobInfo = job.toString();
        System.out.println(jobInfo);
        
        //TravelTypeScene Object test
        TravelTypeScene tScene = new TravelTypeScene();
        
        tScene.setDescription("Travel to Diner");
        tScene.setFuelCost(42);
        tScene.setSkill(2);
        tScene.setTimeToComplete(4.4);
        tScene.setUprades("Stuff");
        
        String tSceneInfo = tScene.toString();
        System.out.println(tSceneInfo);
    }
    
}
