package VehicleInterface;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Bus implements Vehicle {
    @Override
    public void start(){
        System.out.println("Bus启动");
    }
    @Override
    public void stop(){
        System.out.println("Bus停止");
    }
}
