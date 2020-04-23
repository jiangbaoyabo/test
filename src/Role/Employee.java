package Role;

/**
 * Created by 13120 on 2020/4/15.
 */
public class Employee extends Role {
    static  int  id;
    static  String company;
    private int salary;
    public void show(){
        System.out.println(this.id+" "+this.company+" "+this.salary+" "+this.getName()+" "+this.getAge()
                +" "+this.getSex());
    }
    public String toString(){
        return "Employee[id = "+ id+"]";
    }
    public Employee(int id){
        super();
        company="meizu";
        salary=7000;
    }
    public Employee(String company, int salary,int id,String name,int age,String sex){
        super(name,age,sex);
        this.salary=salary;
        this.id=id;
        this.company=company;

    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public static void setCompany(String company){
        Employee.company=company;
    }
    public String getCompany(){
        return company;
    }



    @Override
    public void play(){
        super.sing();
        System.out.println("Employee类下面的play()方法");
    }


}
