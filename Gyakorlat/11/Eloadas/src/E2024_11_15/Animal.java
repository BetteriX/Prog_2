package E2024_11_15;

public abstract class Animal {
    
    private double speedInMeterPerSec;
    private String sound;
    private double weight;
    private int numberOfLegs;

    public Animal(double speedInMeterPerSec, String sound, double weight, int numberOfLegs) {
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.sound = sound;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public String getSound() {
        return sound;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public double getWeightInKg() {
        return weight;
    }

    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }

    @Override
    public abstract String toString();
    
    
}
