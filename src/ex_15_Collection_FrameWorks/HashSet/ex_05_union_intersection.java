package ex_15_Collection_FrameWorks.HashSet;

import java.util.HashSet;

public class ex_05_union_intersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(7);
        set2.add(1);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union : " + union);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Intersection : "+ intersection);

    }
}
