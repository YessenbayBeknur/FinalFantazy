package task2;

public class test {
    public static void main(String[] args) {
        Currency c = new Currency();
        DisplayCurrency displayCurrency = new DisplayCurrency(c);
        DisplayDifference displayDifference = new DisplayDifference(c);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    c.Changed();
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
