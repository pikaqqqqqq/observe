/**
 * Created by think on 2017/7/3.
 */
public class HugObserve implements Observe {
    @Override
    public void handleWakeUp(WakeUpEvent event) {
        System.out.println("Hug");
    }
}
