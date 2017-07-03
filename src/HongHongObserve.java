/**
 * Created by think on 2017/7/3.
 */
public class HongHongObserve implements Observe{
    @Override
    public void handleWakeUp(WakeUpEvent event) {
        if (event.voice > 5){
            System.out.println("Honghong");
        }

    }
}
