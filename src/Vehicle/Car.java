package Vehicle;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Car extends Vehicle{
    public Car(String name){
        super(name);
    }
    @Override
    public void wheelsNum (){
        System.out.println("四轮车");
    }
}


