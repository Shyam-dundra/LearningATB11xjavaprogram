package ex_15_Collection_FrameWorks.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex_01_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        m1.put("Name","Shyam");
        m1.put("Phone",  8897819);
        m1.put("Roll_No",11);

        System.out.println(m1);


        System.out.println("_______LinkedHashmap______");

        Map m2 = new LinkedHashMap();

        m2.put("Name", "Krishna");
        m2.put("Phone", 889782);
        m2.put("Roll_No", 12);

        System.out.println(m2);

        System.out.println("___TreeMap___");

        Map m3 = new TreeMap();

        m3.put("Name", "Mohan");
        m3.put("Phone", 98765);
        m3.put("Roll_No", 13);


        System.out.println(m3);

    }

}
