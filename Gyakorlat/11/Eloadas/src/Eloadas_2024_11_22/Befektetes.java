/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eloadas_2024_11_22;

/**
 *
 * @author Tiba Attila
 */
public class Befektetes implements Comparable<Befektetes> {
    private double toke;
    private int futamido;
    private double kamat;

    public Befektetes(double toke, int futamido, double kamat) {
        this.toke = toke;
        this.futamido = futamido;
        this.kamat = kamat;
    }

    public double getToke() {
        return toke;
    }

    public void setToke(double toke) {
        this.toke = toke;
    }

    public int getFutamido() {
        return futamido;
    }

    public void setFutamido(int futamido) {
        this.futamido = futamido;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public double getLejaratiToke() {

        return this.toke * Math.pow(1 + this.kamat / 100, this.futamido);

    }

    @Override
    public int compareTo(Befektetes o) {

        return Double.compare(this.getLejaratiToke(), o.getLejaratiToke());

    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Befektetes)) {
            return false;
        }

        Befektetes b = (Befektetes) obj;

        return this.getLejaratiToke() == b.getLejaratiToke();
    }

    @Override
    public String toString() {
        return "Befektetes{" + "toke=" + toke + ", futamido=" + futamido + ", kamat=" + kamat + '}';
    }

}
