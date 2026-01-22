package UilityFunctions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class WaitSeconds implements Task {

    private final int milliseconds;

    public WaitSeconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public static WaitSeconds forTime(int milliseconds) {
        return new WaitSeconds(milliseconds);
    }

    public static WaitSeconds Now() {
        return new WaitSeconds(2000); // Default 5 second wait
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}