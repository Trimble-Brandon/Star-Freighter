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
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class GameControl 
{

    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Item
    {
        money;
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
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = MapControl.createNewMap();
        MapControl.moveActorsToStartingLocation(map);
    }

    private static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[1];
        
        //item 1
        InventoryItem money = new InventoryItem();
        money.setDescription("Money");
        money.setQuantity(0);
        inventory[Item.money.ordinal()] = money;
        
        return inventory;
    }
  
}