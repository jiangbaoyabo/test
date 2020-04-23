package VehicleInterface;

/**
 * Created by 13120 on 2020/4/15.
 */
public class interfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bus bus = new Bus();
        bike.start();
        bike.stop();
        bus.start();
        bus.stop();
    }
}
