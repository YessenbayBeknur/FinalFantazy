package task2;

import java.util.ArrayList;



public class Currency implements ISubject{
    private ArrayList observers;
    private float currency = 365;
    private float diff = 0;

    public Currency(){
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            IObserver observer = (IObserver)observers.get(i);
            observer.update(currency,diff);
        }
    }



    public void Changed(){
        float r = (float)(Math.random()*2)-1;
        diff += r;
        currency += r;
        if(Math.abs(diff) > 2) {
            notifyObserver();
            diff = 0;
        }


    }
}
