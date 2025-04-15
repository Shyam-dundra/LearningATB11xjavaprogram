package ex_15_Collection_FrameWorks.List;

import java.util.Collections;
import java.util.LinkedList;

public class ex_07_Linked_List {
    public static void main(String[] args) {
        LinkedList <String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("cat");
        animals.add("rat");
        animals.add("Dog1");

        System.out.println("Animals list : "+ animals);

        for (Object obj : animals){

            System.out.println(obj);
        }

        Collections.sort(animals);
        System.out.println(animals);

        animals.remove("Dog1");
        System.out.println("Updated animal list : "+ animals);

        animals.addFirst("Elephant");
        System.out.println(animals);

        animals.removeLast();
        System.out.println(animals);



    }
}
