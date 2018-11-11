package task7;

public class Test {
    public static void main(String[] args) {
        SquareHole squareHole = new SquareHole(10);

        RectanglePeg r = new RectanglePeg(5,3);
        RectangleAdapter rectangleAdapter = new RectangleAdapter(r);

        RoundPeg round = new RoundPeg(2);
        RoundAdapter roundAdapter = new RoundAdapter(round);

        System.out.println(squareHole.fits(rectangleAdapter));
        System.out.println(squareHole.fits(roundAdapter));

    }
}
