/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2024_11_15;

import E2024_11_15.Mammal;
import java.time.LocalDate;

/**
 *
 * @author Tiba Attila
 */
public class Horse extends Mammal implements Comparable<Horse>{    
    private double carryCapacity;
    private String name;
    private String color;
    private LocalDate birthDate;

    public Horse(double carryCapacity, String name, String color, LocalDate birthDate, double speedInMeterPerSec, double weight) {
        super(speedInMeterPerSec, "Nyihaha", weight, 4);
        this.carryCapacity = carryCapacity;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
    }

    @Override
    public boolean liveInGroups() {
        return true;
    }

    @Override
    public boolean hasHair() {
        return true;
    }

    @Override
    public String toString() {
        return this.name +" " +this.birthDate ;
    }

    public double getCarryCapacity() {
        return carryCapacity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public boolean carry(double w)
    {
     return w<=this.carryCapacity;
    
    }

    @Override
    public String futtttyul() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Horse o) {
       
        return Double.compare(this.getSpeedInMeterPerSec(), o.getSpeedInMeterPerSec());
    }
    
    
    
}
