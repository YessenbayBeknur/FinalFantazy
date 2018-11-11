package task2;

public class DisplayDifference implements IDisplay,IObserver {
    private float diff;
    private ISubject Difference;

    public DisplayDifference(ISubject Difference){
        this.Difference = Difference;
        Difference.registerObserver(this);
    }

    @Override
    public void update(float currency,float diff) {
        this.diff = diff;
        display();

    }

    @Override
    public void display() {
        System.out.println("difference dollar is: " + this.diff);
    }
}
