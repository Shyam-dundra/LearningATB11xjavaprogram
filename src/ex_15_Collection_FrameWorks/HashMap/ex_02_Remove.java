package ex_15_Collection_FrameWorks.HashMap;

import java.util.HashMap;

public class ex_02_Remove {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Java","Programing");
        map.put("Python", "Scripting");
        map.put("HTML", "Markup");

        System.out.println("Original HashMap : "+ map);
        map.remove("HTML");
        System.out.println("After removal : "+map);

    }
}
