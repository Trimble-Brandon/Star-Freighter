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
    private int hullSkill;
    private int electricalSkill;
    private int mechanicalSkill;
    private int lifeSupportSkill;
    
    //Default Constructor
    public Player() 
    {
        this.hullSkill = 0;
        this.electricalSkill = 0;
        this.mechanicalSkill = 0;
        this.lifeSupportSkill = 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.topScore);
        hash = 89 * hash + this.hullSkill;
        hash = 89 * hash + this.electricalSkill;
        hash = 89 * hash + this.mechanicalSkill;
        hash = 89 * hash + this.lifeSupportSkill;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.topScore, other.topScore)) {
            return false;
        }
        if (this.hullSkill != other.hullSkill) {
            return false;
        }
        if (this.electricalSkill != other.electricalSkill) {
            return false;
        }
        if (this.mechanicalSkill != other.mechanicalSkill) {
            return false;
        }
        if (this.lifeSupportSkill != other.lifeSupportSkill) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", topScore=" + topScore + ", hullSkill=" + hullSkill + ", electricalSkill=" + electricalSkill + ", mechanicalSkill=" + mechanicalSkill + ", lifeSupportSkill=" + lifeSupportSkill + '}';
    }
    
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTopScore() {
        return topScore;
    }

    public void setTopScore(Double topScore) {
        this.topScore = topScore;
    }

    public int getHullSkill() {
        return hullSkill;
    }

    public void setHullSkill(int hullSkill) {
        this.hullSkill = hullSkill;
    }

    public int getElectricalSkill() {
        return electricalSkill;
    }

    public void setElectricalSkill(int electricalSkill) {
        this.electricalSkill = electricalSkill;
    }

    public int getMechanicalSkill() {
        return mechanicalSkill;
    }

    public void setMechanicalSkill(int mechanicalSkill) {
        this.mechanicalSkill = mechanicalSkill;
    }

    public int getLifeSupportSkill() {
        return lifeSupportSkill;
    }

    public void setLifeSupportSkill(int lifeSupportSkill) {
        this.lifeSupportSkill = lifeSupportSkill;
    }
    
}
