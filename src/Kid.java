/**
 * Created by think on 2017/7/3.
 */
public class Kid {
    public boolean sleeping = true;

    Observe o;

    public  void wakeUp(){
        o.handleWakeUp();
    }
}
