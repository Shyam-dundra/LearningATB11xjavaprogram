package ex_15_Collection_FrameWorks.HashMap;

import java.util.HashMap;
import java.util.Map;

public class ex_04_EntrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Orange", 50);
        map.put("Grapes", 70);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key : "+ entry.getKey() + ", value : " + entry.getValue());
        }
    }
}
