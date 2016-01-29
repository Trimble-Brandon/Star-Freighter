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
public class GameCharacter 
{
    //Class instance variables
    private String name;
    private String description;
    private String attributes;
    
    //Default Constructor
    public GameCharacter() 
    {
        
    }
    
    //
    @Override
    public String toString() 
    {
        return "GameCharacter{" + "name=" + name + ", description=" + description + ", attributes=" + attributes + '}';
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.attributes);
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
        final GameCharacter other = (GameCharacter) obj;
        if (!Objects.equals(this.name, other.name)) 
        {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) 
        {
            return false;
        }
        if (!Objects.equals(this.attributes, other.attributes)) 
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

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getAttributes() 
    {
        return attributes;
    }

    public void setAttributes(String attributes) 
    {
        this.attributes = attributes;
    }
    
    
    
}
