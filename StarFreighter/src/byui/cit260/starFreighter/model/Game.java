/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brandon
 */
public class Game implements Serializable 
{
    //Class instance variables
    private Integer noPeople;
    private int totalTime;
    private Ship ship;
    private InventoryItem[] inventory;
    private Player player;
    private GameCharacter characters;
    private Map map;
    

    //Default constructor
    public Game()
    {
        
    }

    //
    @Override
    public String toString() {
        return "game{" + "noPeople=" + noPeople + ", totalTime=" + totalTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.noPeople);
        hash = 97 * hash + Objects.hashCode(this.totalTime);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.noPeople, other.noPeople)) 
        {
            return false;
        }
        if (!Objects.equals(this.totalTime, other.totalTime)) 
        {
            return false;
        }
        return true;
    }

    //Getters and Setters
    public Integer getNoPeople() 
    {
        return noPeople;
    }

    public void setNoPeople(Integer noPeople) 
    {
        this.noPeople = noPeople;
    }

    public int getTotalTime() 
    {
        return totalTime;
    }

    public void setTotalTime(int totalTime) 
    {
        this.totalTime = totalTime;
    }
    
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GameCharacter getCharacters() {
        return characters;
    }

    public void setCharacters(GameCharacter characters) {
        this.characters = characters;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
}
