package Teacher;



/**
 * Created by 13120 on 2020/4/15.
 */
public class MusicTeacher extends Teacher {
  public  MusicTeacher (int id , String name, int age, String education, String teacherTitle){
      super(id,name,age,education,teacherTitle);
  }
    @Override
    public void teachProcedure(){
        System.out.println("先唱歌，后弹琴");
    }
}
