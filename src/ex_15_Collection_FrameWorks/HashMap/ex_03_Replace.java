package ex_15_Collection_FrameWorks.HashMap;

import java.util.HashMap;

public class ex_03_Replace {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Orange", 50);
        map.put("Grapes", 70);

        System.out.println("Fruits prices "+ map);

        map.replace("Apple", 70);

        System.out.println("Updated map : "+ map);
    }
}
