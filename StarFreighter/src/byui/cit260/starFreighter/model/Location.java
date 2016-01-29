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
public class Location 
{
    //Class instance variables
    private Integer locationChoice; //Changed from simply location to better explain what it does
    private String locationName;
    private String description;
    
    //Default Constructor
    public Location() 
    {
       
    }
    
    //
    @Override
    public String toString() 
    {
        return "Location{" + "locationChoice=" + locationChoice + ", locationName=" + locationName + ", description=" + description + '}';
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.locationChoice);
        hash = 59 * hash + Objects.hashCode(this.locationName);
        hash = 59 * hash + Objects.hashCode(this.description);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.locationName, other.locationName)) 
        {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) 
        {
            return false;
        }
        if (!Objects.equals(this.locationChoice, other.locationChoice)) 
        {
            return false;
        }
        return true;
    }
    
    //
    public Integer getLocationChoice() 
    {
        return locationChoice;
    }

    public void setLocationChoice(Integer locationChoice) 
    {
        this.locationChoice = locationChoice;
    }

    public String getLocationName() 
    {
        return locationName;
    }

    public void setLocationName(String locationName) 
    {
        this.locationName = locationName;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }
    
}
