package Vehicle;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Motorbike extends Vehicle{
    public Motorbike(String name){
        super(name);
    }
    @Override
    public void wheelsNum() {
        System.out.println("双轮车");
    }
}
