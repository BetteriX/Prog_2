/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2024_11_15;

import java.time.LocalDate;

/**
 *
 * @author Tiba Attila
 */
public class Ostrich  extends Bird{
    private double carryCapacity;
    private String name;
    private String featherPattern;
    private LocalDate birthDate;

    public Ostrich(double carryCapacity, String name, String featherPattern, double speedInMeterPerSec, double weight) {
        super(speedInMeterPerSec, "Beep", weight, 2);
        this.carryCapacity = carryCapacity;
        this.name = name;
        this.featherPattern = featherPattern;
    }

    @Override
    public boolean buildNest() {
       return false;
    }

    @Override
    public String toString() {
        return this.name + " " + super.getNumberOfLegs();
    }
    
    
    
}
