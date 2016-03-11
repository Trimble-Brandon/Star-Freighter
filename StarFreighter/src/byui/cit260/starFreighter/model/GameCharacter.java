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
public enum GameCharacter implements Serializable
{
    Cookie("The grand chef of the ship!");
    
    
    //Class instance variables
    private final String description;
    private final String attributes;
    
    //Default Constructor
    GameCharacter(String description)
    {
        //
        attributes = "";

        this.description = description;
        
    }
    
    //
    @Override
    public String toString() 
    {
        return "GameCharacter{" + "name=" + ", description=" + description + ", attributes=" + attributes + '}';
    }

    //
   
    public String getDescription() 
    {
        return description;
    }

    public String getAttributes() 
    {
        return attributes;
    }
 
}
