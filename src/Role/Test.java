package Role;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 =new Employee(1);
        Employee e2=new Employee("阿里",4000,2,"李四",20,"女");
        System.out.println(e1.getCompany());
        e2.show();
        e1.play();
        e1.sing();
    }
}
