/**
 * Created by think on 2017/7/3.
 */
public class BeatObserve implements Observe{
    @Override
    public void handleWakeUp() {
        System.out.println("Beat");
    }
}
