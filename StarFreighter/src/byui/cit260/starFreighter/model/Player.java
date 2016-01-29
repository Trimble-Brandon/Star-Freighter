/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.model;

import java.util.Objects;

/**
 *
 * @author Brandon
 */
public class Player 
{
    //Class instance variables
    private String name;
    private Double topScore;
    
    //Default Constructor
    public Player() 
    {
        
    }
    
    //
    @Override
    public String toString() 
    {
        return "Player{" + "name=" + name + ", topScore=" + topScore + '}';
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.topScore);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) 
        {
            return false;
        }
        if (!Objects.equals(this.topScore, other.topScore)) 
        {
            return false;
        }
        return true;
    }
    
    //
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Double getTopScore() 
    {
        return topScore;
    }

    public void setTopScore(Double topScore) 
    {
        this.topScore = topScore;
    }
    
}
