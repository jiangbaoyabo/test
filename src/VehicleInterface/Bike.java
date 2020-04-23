package VehicleInterface;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("bike启动");
    }
    @Override
    public void stop(){
        System.out.println("bike停止");
    }
}
