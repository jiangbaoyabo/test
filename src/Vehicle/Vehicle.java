package Vehicle;

/**
 * Created by 13120 on 2020/4/15.
 */
public abstract class  Vehicle {
    private String name;
    public void run(){
        System.out.println("Running");
    }
    public void Called(){
        System.out.println(this.name);
    }
    public Vehicle(String name){
        super();
        this.name=name;
    }

    abstract void wheelsNum();
}
