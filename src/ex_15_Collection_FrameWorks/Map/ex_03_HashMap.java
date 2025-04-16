package ex_15_Collection_FrameWorks.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ex_03_HashMap {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap();

        student1.put("FirstName","Shyam" );
        student1.put("Lastname", "Dundra");
        student1.put("Phone",889781);
        student1.put("Address","Delhi");
        student1.put("Roll_No", 10);


        Map<String, Object> student2 = new HashMap();

        student2.put("FirstName","Krishna" );
        student2.put("Lastname", "Dundra");
        student2.put("Phone",9121334);
        student2.put("Address","HYD");
        student2.put("Roll_No", 11);

        Map<String, Object> student3 = new HashMap();

        student3.put("FirstName","Krishna" );
        student3.put("Lastname", "Dundra");
        student3.put("Phone",9121334);
        student3.put("Address","HYD");
        student3.put("Roll_No", 11);

        List Students_List = new ArrayList();

        Students_List.add(student1);
        Students_List.add(student2);
        Students_List.add(student3);

        System.out.println(Students_List);

        System.out.println("*_______________*");

        System.out.println(student1.get("FirstName"));
        System.out.println(student2.isEmpty());

        System.out.println(student1);

    }

}
