package ex_15_Collection_FrameWorks.List;

import java.util.ArrayList;

public class ex_01_List_String {
    public static void main(String[] args) {
//        A List is an ordered collection that allows duplicates. The ArrayList implementation is commonly used.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits List : "+ fruits);
        // Access elements
        System.out.println(fruits.get(3));
        //Iteration
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        fruits.remove("Banana");
        System.out.println("Updated list : " + fruits);
    }
}
