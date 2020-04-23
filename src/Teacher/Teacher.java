package Teacher;

/**
 * Created by 13120 on 2020/4/15.
 */
public abstract class Teacher {
    //属性
    private int id;
    private String name;
    private  int age;
    private String teacherTitle;
    private  String education;

    //方法
    public void startWork(int time){
        System.out.println(this.name+time+"点上班");
    }
    public void offWork(int time){
        System.out.println(this.name+time+"点下班");
    }
    public void teach(String course){
        System.out.println(this.name+"教"+course);
    }
    public String toString(){
        return "Teacher[id="+id+",name="+name+", age=" + age + ", education=" + education +", teacherTitile="+teacherTitle+"]";
    }
    abstract public void teachProcedure();
    //构造方法
    public Teacher(int id,String name,int age,String education,String teacherTitle){
        super();
        this.id=id;
        this.name=name;
        this.age=age;
        this.education=education;
        this.teacherTitle=teacherTitle;
    }
}

