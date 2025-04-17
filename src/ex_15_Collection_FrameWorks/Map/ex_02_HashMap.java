package ex_15_Collection_FrameWorks.Map;

import java.util.HashMap;
import java.util.Map;

public class ex_02_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("id1", null);
        map.put(null, null);
        map.put("id2", 897);
        map.put("id3", null);
        map.put(null, "Shyam");

        System.out.println(map);

    }

}
