import java.util.ArrayList;
import java.util.List;

/**
 * Created by think on 2017/7/3.
 */
public class Kid {
    public boolean sleeping = true;

    List<Observe> observes = new ArrayList<Observe>();

    public void wakeUp() {
        WakeUpEvent event = new WakeUpEvent(10, this);
        observes.forEach(observe -> {
            observe.handleWakeUp(event);
        });
    }
}
