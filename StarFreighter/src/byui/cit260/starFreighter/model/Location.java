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
    private int location;
    private String locationName;
    private String description;
    
    //Default Constructor
    public Location() 
    {
       
    }
    
    public Location(int loc, String locName, String desc) {
        this.location = loc;
        this.locationName = locName;
        this.description = desc;
    }
    
    //
    @Override
    public String toString() 
    {
        return "Location{" + "locationChoice=" + location + ", locationName=" + locationName + ", description=" + description + '}';
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.location);
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
        if (!Objects.equals(this.location, other.location)) 
        {
            return false;
        }
        return true;
    }
    
    //
    public Integer getLocation() 
    {
        return location;
    }

    public void setLocation(Integer location) 
    {
        this.location = location;
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