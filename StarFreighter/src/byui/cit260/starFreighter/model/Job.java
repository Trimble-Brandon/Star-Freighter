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
public class Job {
    private String description;
    private int difficulty;
    private double currencyReward;
    private String itemReward;

    public Job() {
        
    }
    
    public Job(String description, int difficulty, double currencyReward, String itemReward) {
        this.description = description;
        this.difficulty = difficulty;
        this.currencyReward = currencyReward;
        this.itemReward = itemReward;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.difficulty);
        hash = 97 * hash + Objects.hashCode(this.currencyReward);
        hash = 97 * hash + Objects.hashCode(this.itemReward);
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
        final Job other = (Job) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.currencyReward, other.currencyReward)) {
            return false;
        }
        if (!Objects.equals(this.itemReward, other.itemReward)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Job{" + "description=" + description + ", difficulty=" + difficulty + ", currencyReward=" + currencyReward + ", itemReward=" + itemReward + '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public double getCurrencyReward() {
        return currencyReward;
    }

    public void setCurrencyReward(Double currencyReward) {
        this.currencyReward = currencyReward;
    }

    public String getItemReward() {
        return itemReward;
    }

    public void setItemReward(String itemReward) {
        this.itemReward = itemReward;
    }
    
    
}
