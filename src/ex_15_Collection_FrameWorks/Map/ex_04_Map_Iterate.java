package ex_15_Collection_FrameWorks.Map;

import java.util.*;

public class ex_04_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        map.put("Shyam", 1);
        map.put("Pravalika", 2);
        map.put("Mahesh", 3);
        map.put("Krishna", 4);


        for(Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey()+" -> "+item.getValue());
        }



    }

}
