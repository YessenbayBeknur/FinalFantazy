package task2;

public class DisplayCurrency implements IObserver,IDisplay {
    private float currency;
    private ISubject Currency;

    public DisplayCurrency(ISubject Currency){
        this.Currency = Currency;
        Currency.registerObserver(this);
    }

    @Override
    public void update(float currency, float diff) {
        this.currency = currency;
        display();

    }

    @Override
    public void display() {
        System.out.println("dollar is: " + this.currency);
    }
}
