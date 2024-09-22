import java.lang.Math;

class Circle {
    public double sugar;

    public Circle(double sugar){
        this.sugar = sugar;
    }


    public double kerulet(){
        return 2 * sugar * Math.PI;
    }

    public double terulet(){
        return (sugar * sugar) * Math.PI;
    }
}
