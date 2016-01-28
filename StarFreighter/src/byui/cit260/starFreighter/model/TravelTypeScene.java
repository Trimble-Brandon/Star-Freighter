/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.model;

import java.util.Objects;

/**
 *
 * @author Joseph
 */
public class TravelTypeScene {
    private String description;
    private Double timeToComplete;
    private Integer skill;
    private String uprades;
    private Integer fuelCost;

    public TravelTypeScene() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.timeToComplete);
        hash = 97 * hash + Objects.hashCode(this.skill);
        hash = 97 * hash + Objects.hashCode(this.uprades);
        hash = 97 * hash + Objects.hashCode(this.fuelCost);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TravelTypeScene other = (TravelTypeScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.timeToComplete, other.timeToComplete)) {
            return false;
        }
        if (!Objects.equals(this.skill, other.skill)) {
            return false;
        }
        if (!Objects.equals(this.uprades, other.uprades)) {
            return false;
        }
        if (!Objects.equals(this.fuelCost, other.fuelCost)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TravelTypeScene{" + "description=" + description + ", timeToComplete=" + timeToComplete + ", skill=" + skill + ", uprades=" + uprades + ", fuelCost=" + fuelCost + '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(Double timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public String getUprades() {
        return uprades;
    }

    public void setUprades(String uprades) {
        this.uprades = uprades;
    }

    public Integer getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(Integer fuelCost) {
        this.fuelCost = fuelCost;
    }
    
    
}
