package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Set<Map.Entry<String, String>> entries = map.entrySet();

        map.put("a","value1");
        map.put("b","value2");
        map.put("c","value2");
        System.out.println(map.put(null, "value4"));
        System.out.println(map.put(null, "value2"));


    }
}
