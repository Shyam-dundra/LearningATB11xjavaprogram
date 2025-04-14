package ex_15_Collection_FrameWorks.List;

import java.util.*;

public class ex_11_ReverseOrder {
    public static void main(String[] args) {
        List marks = new ArrayList();

        marks.add(10);
        marks.add(12);
        marks.add(9);
        marks.add(11);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());

        System.out.println(marks);

    }
}
