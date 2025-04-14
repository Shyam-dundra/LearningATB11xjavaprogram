package ex_15_Collection_FrameWorks.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class ex_01_HashSet_collection {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Apple");
        fruits.add("apple");
        fruits.add("mango"); // HashSet doesnot allow duplicate objects

        System.out.println("Fruits List : " + fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
