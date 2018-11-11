package task7;

public class RoundPeg {
    private double radius;

    RoundPeg(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    double getArea(){
        return Math.PI * getRadius() * getRadius();
    }

}
