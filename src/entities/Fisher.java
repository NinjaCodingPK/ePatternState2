package entities;

/**
 * Created by wookie on 5/25/16.
 */
public class Fisher implements State {
    @Override
    public void doWork() {
        System.out.println("Catch a fish");
    }
}
