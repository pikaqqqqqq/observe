/**
 * Created by think on 2017/7/3.
 */
public class Test {
    public static void main(String[] args){
        Kid k = new Kid();
        //k.o = new HongHongObserve();
        k.o = new BeatObserve();
        k.wakeUp();
    }
}
