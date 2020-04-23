package Map;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by 13120 on 2020/4/20.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        System.out.println(map);
    }
}
