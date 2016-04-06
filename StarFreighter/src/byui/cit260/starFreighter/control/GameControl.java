/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.control;

import byui.cit260.starFreighter.exceptions.GameControlException;
import byui.cit260.starFreighter.model.Game;
import byui.cit260.starFreighter.model.InventoryItem;
import byui.cit260.starFreighter.model.Map;
import byui.cit260.starFreighter.model.Player;
import byui.cit260.starFreighter.model.Ship;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class GameControl 
{
    public static List<InventoryItem> getSortedInventoryList() {
        List<InventoryItem> inventoryList = StarFreighter.getCurrentGame().getInventory();
        return inventoryList;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        StarFreighter.setCurrentGame(game);
        System.out.println("Welcome back, " + StarFreighter.getCurrentGame().getPlayer().toString());
    }
    
    public enum Item
    {
        money,
        squirtGun,
        pistol,
        pistolSword,
        rifle,
        hCannon,
        lightsaber;
    }
    
    public static Player createPlayer(String playerName) throws GameControlException {
        if (playerName == null) {
            throw new GameControlException("Player name cannot be null");
        }
        
        Player player = new Player();
        player.setName(playerName);
        
        StarFreighter.setPlayer(player);
        
        return player;
    }

    public static void newGame(Player player) {
        Game game = new Game();
        
        StarFreighter.setCurrentGame(game);
        
        game.setPlayer(player);
        
        List<InventoryItem> inventoryList = GameControl.createInventoryList();
        
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = MapControl.createNewMap();
    }

    private static List<InventoryItem> createInventoryList() {
        List<InventoryItem> inventory = new ArrayList();
        
        //item 1
        InventoryItem money = new InventoryItem("Money", 200, "Currency", 0);
        inventory.add(money);
        
        //item 2
        InventoryItem squirtGun = new InventoryItem("Squirt gun", 
                                                    0, 
                                                    "Powerfull pistol for the purpose of propelling a water jet", 
                                                    1);
        inventory.add(squirtGun);
        
        //item 3
        InventoryItem pistol = new InventoryItem("Pistol", 
                                                    0, 
                                                    "Small hand held projectile weapon", 
                                                    1);
        inventory.add(pistol);
        
        //item 4
        InventoryItem pistolSword = new InventoryItem("Pistol & Sword", 
                                                    0, 
                                                    "Small hand held projectile weapon and a clamour", 
                                                    3);
        inventory.add(pistolSword);
        
        //item 5
        InventoryItem rifle = new InventoryItem("Rifle", 
                                                    0, 
                                                    "Long range projectile weapon", 
                                                    2);
        inventory.add(rifle);
        
        //item 6
        InventoryItem hCannon = new InventoryItem("Hand Cannon", 
                                                    0, 
                                                    "Powerful short range large projectile weapon", 
                                                    2);
        inventory.add(hCannon);
        
        //item 7 
        InventoryItem lightsaber = new InventoryItem("Lightsaber ===|-----------", 
                                                    0, 
                                                    "Awesomeness", 
                                                    3);
        inventory.add(lightsaber);
        
        return inventory;
    }
}