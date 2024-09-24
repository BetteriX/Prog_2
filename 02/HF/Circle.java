import java.lang.Math;

class Circle {
    public double sugar;

    // Konstruktor
    public Circle(double sugar){
        this.sugar = sugar;
    }


    public double kerulet(){
        return 2 * sugar * Math.PI;
    }

    public double terulet(){
        return (sugar * sugar) * Math.PI;
    }

    public boolean isSmamallerThan(Circle c2){
        return this.sugar < c2.sugar; 
    }
}

