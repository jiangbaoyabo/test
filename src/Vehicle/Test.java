package Vehicle;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car("奔驰");
        Motorbike motorbike = new Motorbike("艾玛");
        car.Called();
        car.wheelsNum();
        car.run();
        motorbike.Called();
        motorbike.wheelsNum();
        motorbike.run();
    }
}
