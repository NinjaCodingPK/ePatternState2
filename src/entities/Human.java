package entities;

/**
 * Created by wookie on 5/25/16.
 */
public class Human {
    private State state;

    public void doSomething(String near) {
        switch (near) {
            case "Fish":
                setState(new Fisher());
                break;

            case "Animal":
                setState(new Hunter());
                break;

            case "Mushroom":
                setState(new Mushroomer());
                break;
        }

        state.doWork();

    }

    private void setState(State state) {
        this.state = state;
    }
}
