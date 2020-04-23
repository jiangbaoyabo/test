package Teacher;

/**
 * Created by 13120 on 2020/4/15.
 */
public class TestMusicTeacher {
    public static void main(String[] args) {
        Teacher musicTeacher = new MusicTeacher(1,"张三",20,"音乐","教授");
        musicTeacher.startWork(8);
        musicTeacher.offWork(19);
        System.out.println(musicTeacher);
        musicTeacher.teachProcedure();
    }
}
