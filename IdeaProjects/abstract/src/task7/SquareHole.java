package task7;

public class SquareHole {
    private double width;

    public SquareHole(double width){
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    double getArea(){
        return getWidth() * getWidth();
    }

    boolean fits (SquarePeg peg){
        if (getArea() > peg.getArea() && getWidth() > peg.getWidth())return true;
        else return false;
    }
    double freeSpace(SquarePeg peg){
        return Math.abs(getArea() - peg.getArea());
    }
}
