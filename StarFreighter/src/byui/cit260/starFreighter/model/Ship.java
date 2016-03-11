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
 * @author Joseph
 */
public class Ship implements Serializable {
    private String description;
    private Integer maxCapacity;
    private Integer engine;
    private Integer fuelLevel;
    private Integer hull;
    private Integer electrical;
    private Integer lifeSupport;

    public Ship() {
        this.description = "";
        this.maxCapacity = 1000; //The fire marshall says so
        this.engine = 1;
        this.fuelLevel = 100;
        this.hull = 100;
        this.electrical = 100;
        this.lifeSupport = 100;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.maxCapacity);
        hash = 37 * hash + Objects.hashCode(this.engine);
        hash = 37 * hash + Objects.hashCode(this.fuelLevel);
        hash = 37 * hash + Objects.hashCode(this.hull);
        hash = 37 * hash + Objects.hashCode(this.electrical);
        hash = 37 * hash + Objects.hashCode(this.lifeSupport);
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
        final Ship other = (Ship) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.maxCapacity, other.maxCapacity)) {
            return false;
        }
        if (!Objects.equals(this.engine, other.engine)) {
            return false;
        }
        if (!Objects.equals(this.fuelLevel, other.fuelLevel)) {
            return false;
        }
        if (!Objects.equals(this.hull, other.hull)) {
            return false;
        }
        if (!Objects.equals(this.electrical, other.electrical)) {
            return false;
        }
        if (!Objects.equals(this.lifeSupport, other.lifeSupport)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "description=" + description + ", maxCapacity=" + maxCapacity + ", engine=" + engine + ", fuelLevel=" + fuelLevel + ", hull=" + hull + ", electrical=" + electrical + ", lifeSupport=" + lifeSupport + '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public Integer getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Integer fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Integer getHull() {
        return hull;
    }

    public void setHull(Integer hull) {
        this.hull = hull;
    }

    public Integer getElectrical() {
        return electrical;
    }

    public void setElectrical(Integer electrical) {
        this.electrical = electrical;
    }

    public Integer getLifeSupport() {
        return lifeSupport;
    }

    public void setLifeSupport(Integer lifeSupport) {
        this.lifeSupport = lifeSupport;
    }
    
    
}
