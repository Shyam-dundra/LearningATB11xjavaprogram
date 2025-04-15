package ex_15_Collection_FrameWorks.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex_05_Sorting {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Orange", 50);
        map.put("Grapes", 70);

        Map<String,Integer> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted by keys : "+ sortedMap);
    }
}
