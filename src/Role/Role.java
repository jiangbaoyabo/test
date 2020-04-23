package Role;

/**
 * Created by 13120 on 2020/4/15.
 */
public abstract class Role {
   private String name;
    private    int age;
    private String sex;
    public Role(){
      super();
    }
    abstract void play();

    final void sing(){
        System.out.println("我在唱歌");
    }
    public Role(String name ,int age,String sex){
        super();
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }


}
