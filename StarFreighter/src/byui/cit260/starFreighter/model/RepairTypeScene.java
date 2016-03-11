/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.model;

import java.util.Objects;
import starfreighter.StarFreighter;

/**
 *
 * @author Brandon
 */
public class RepairTypeScene
{
    public enum sceneType
    {
        scene1;
    }
    
    //Class instance variables
    private String description;
    private int timeToComplete;
    private Double cost;
    private Integer skill;
    private Integer expGained;
    private Double amountRepaired;
    
    //Default Constructor
    public RepairTypeScene() 
    {
        
    }
    
    private static RepairTypeScene[] createScenes()
    {
        Game game = StarFreighter.getCurrentGame();
        
        RepairTypeScene[] scenes = new RepairTypeScene[sceneType.values().length];
        
        RepairTypeScene scene1 = new RepairTypeScene();
        scene1.setDescription("This is a scene for repairs.");
        
        scene1.setTimeToComplete(30);
        scene1.setCost(50000.00);
        scene1.setSkill(5);
        scene1.setExpGained(500);
        scene1.setAmountRepaired(100.00);
        
        scenes[sceneType.scene1.ordinal()] = scene1;
        
        return scenes;
    }
    
    //
    @Override
    public String toString() 
    {
        return "RepairTypeScene{" + "description=" + description + ", timeToComplete=" + timeToComplete + ", cost=" + cost + ", skill=" + skill + ", expGained=" + expGained + ", amountRepaired=" + amountRepaired + '}';
    }

    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.timeToComplete);
        hash = 29 * hash + Objects.hashCode(this.cost);
        hash = 29 * hash + Objects.hashCode(this.skill);
        hash = 29 * hash + Objects.hashCode(this.expGained);
        hash = 29 * hash + Objects.hashCode(this.amountRepaired);
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
        final RepairTypeScene other = (RepairTypeScene) obj;
        if (!Objects.equals(this.description, other.description)) 
        {
            return false;
        }
        if (!Objects.equals(this.timeToComplete, other.timeToComplete)) 
        {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) 
        {
            return false;
        }
        if (!Objects.equals(this.skill, other.skill)) 
        {
            return false;
        }
        if (!Objects.equals(this.expGained, other.expGained)) 
        {
            return false;
        }
        if (!Objects.equals(this.amountRepaired, other.amountRepaired)) 
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

    public int getTimeToComplete() 
    {
        return timeToComplete;
    }

    public void setTimeToComplete(int timeToComplete) 
    {
        this.timeToComplete = timeToComplete;
    }

    public Double getCost() 
    {
        return cost;
    }

    public void setCost(Double cost) 
    {
        this.cost = cost;
    }

    public Integer getSkill() 
    {
        return skill;
    }

    public void setSkill(Integer skill) 
    {
        this.skill = skill;
    }

    public Integer getExpGained() 
    {
        return expGained;
    }

    public void setExpGained(Integer expGained) {
        
        this.expGained = expGained;
    }

    public Double getAmountRepaired() 
    {
        return amountRepaired;
    }

    public void setAmountRepaired(Double amountRepaired) 
    {
        this.amountRepaired = amountRepaired;
    }
   
}
