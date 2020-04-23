package 常用类;

/**
 * Created by 13120 on 2020/4/17.
 */
public class test2 {
    public static void main(String[] args) {
        String str = new String("hello");
        String str1 = "hello";
        System.out.println(str==str1);//比较内存地址
        System.out.println(str.equals(str1));//比较值得大小
    }
}
