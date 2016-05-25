package entities;

/**
 * Created by wookie on 5/25/16.
 */
public class Hunter implements State {
    @Override
    public void doWork() {
        System.out.println("Do shot...");
    }
}
