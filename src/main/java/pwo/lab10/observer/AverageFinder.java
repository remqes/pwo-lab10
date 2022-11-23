package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AverageFinder implements Subscriber {
    Integer sum = null;
    Integer count = 0;
    
    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
        count = count == 0 ? 1 : count + 1;
    }
    
    public float getAverage() {
        return (float) sum/count;
    }
}
