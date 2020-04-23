package Teacher;

/**
 * Created by 13120 on 2020/4/15.
 */
public class TestsoftwareTeacher {
    public static void main(String[] args) {
        Teacher softwareTeacher = new SoftwareTeacher(2,"李四",30,"软件","研究生");
        softwareTeacher.startWork(9);
        softwareTeacher.offWork(20);
        System.out.println(softwareTeacher);
        softwareTeacher.teachProcedure();
    }
}
