package ex_15_Collection_FrameWorks.List;
import java.util.*;
public class ex_10_NestedList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("grapes");

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Brinjal");

        List all_types = new ArrayList();

        all_types.add(fruits1);
        all_types.add(fruits2);
        all_types.add(vegetables);

        System.out.println(all_types);
        System.out.println(all_types.get(1));

    }
}
