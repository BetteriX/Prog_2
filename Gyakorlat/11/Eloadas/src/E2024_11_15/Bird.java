/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2024_11_15;

/**
 *
 * @author Tiba Attila
 */
public abstract class Bird extends Animal {

    public Bird(double speedInMeterPerSec, String sound, double weight, int numberOfLegs) {
        super(speedInMeterPerSec, sound, weight, numberOfLegs);
    }
    
    public abstract boolean buildNest();
    
}
