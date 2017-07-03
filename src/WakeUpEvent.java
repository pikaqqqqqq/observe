/**
 * Created by think on 2017/7/3.
 */
public class WakeUpEvent {
    public int voice;
    public Kid source;

    public WakeUpEvent(int voice, Kid source) {
        this.voice = voice;
        this.source = source;
    }

    public Kid getSource(){
        return source;
    }
}
