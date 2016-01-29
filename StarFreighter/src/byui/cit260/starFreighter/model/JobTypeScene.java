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
public class JobTypeScene 
{
    //Class instance variables
    private String description;
    private Double timeToComplete;
    private Integer expGained;
    
    //Default Constructor
    public JobTypeScene() 
    {
        
    }
    
    //
    @Override
    public String toString() 
    {
        return "JobTypeScene{" + "description=" + description + ", timeToComplete=" + timeToComplete + ", expGained=" + expGained + '}';
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.timeToComplete);
        hash = 43 * hash + Objects.hashCode(this.expGained);
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
        final JobTypeScene other = (JobTypeScene) obj;
        if (!Objects.equals(this.description, other.description)) 
        {
            return false;
        }
        if (!Objects.equals(this.timeToComplete, other.timeToComplete)) 
        {
            return false;
        }
        if (!Objects.equals(this.expGained, other.expGained)) 
        {
            return false;
        }
        return true;
    }
    
    //
    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public Double getTimeToComplete() 
    {
        return timeToComplete;
    }

    public void setTimeToComplete(Double timeToComplete) 
    {
        this.timeToComplete = timeToComplete;
    }

    public Integer getExpGained() 
    {
        return expGained;
    }

    public void setExpGained(Integer expGained) 
    {
        this.expGained = expGained;
    }
    
}
