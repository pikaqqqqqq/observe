/**
 * Created by think on 2017/7/3.
 */
public class Test {
    public static void main(String[] args){
        Kid k = new Kid();
        //k.o = new HongHongObserve();
        k.observes.add(new BeatObserve());
        k.observes.add(new HongHongObserve());
        k.observes.add(new HugObserve());
        k.wakeUp();
    }
}
