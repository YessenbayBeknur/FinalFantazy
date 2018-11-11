package task7;

public class SquarePeg {
    private double width;

    SquarePeg(){

    }

    SquarePeg(double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return getWidth() * getWidth();
    }
}
