package task7;

public class RoundAdapter extends SquarePeg {
    RoundPeg roundPeg;

    RoundAdapter(RoundPeg r){
        this.roundPeg = r;
    }

    public double getArea() {
        return this.roundPeg.getArea();
    }
}
