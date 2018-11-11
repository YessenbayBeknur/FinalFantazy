package task7;

public class RectanglePeg {
    private double width,height;

    RectanglePeg(double width, double height){
        this.width = width;
        this.height = height;
    }

    public RectanglePeg() {
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    double getArea(){
        return this.getWidth() * this.getHeight();
    }
}
