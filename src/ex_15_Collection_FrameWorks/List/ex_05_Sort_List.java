package ex_15_Collection_FrameWorks.List;


import java.util.ArrayList;
import java.util.Collections;


public class ex_05_Sort_List {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Shyam");
        names.add("Krishna");
        names.add("Mohan");
        names.add("Sri");
        names.add("Arjun");
        names.add("Balu");

        System.out.println("Names List : " + names);

        Collections.sort(names);
        System.out.println("After sorting List : "+ names);
    }
}
