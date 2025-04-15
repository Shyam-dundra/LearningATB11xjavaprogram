package ex_15_Collection_FrameWorks.HashSet;

import java.util.HashSet;

public class ex_03_Remove_Elements {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("cat");
        list.add("dog");
        list.add("rat");
        list.add("cow");
        System.out.println("List : "+list);
        list.remove("rat");
        System.out.println("After removes rat : " + list);
    }
}
