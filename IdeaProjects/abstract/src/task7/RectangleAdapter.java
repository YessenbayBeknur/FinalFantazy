package task7;

public class RectangleAdapter extends SquarePeg{
    RectanglePeg rectanglePeg;

    public RectangleAdapter(RectanglePeg p) {
        rectanglePeg = p;
    }

    public double getArea() {
        return this.rectanglePeg.getArea();
    }
    public double getWidth(){
        return this.rectanglePeg.getWidth();
    }
}
