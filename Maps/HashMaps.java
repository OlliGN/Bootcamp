package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String [] args){
        // HashMaps are Unique and unordered
        Map m = new HashMap();
        m.put("Tim", 5);
        m.put("Joe", "x");
        m.put("11", 999);
        System.out.println(m);
        System.out.println(m.get("Tim"));
    }
}
