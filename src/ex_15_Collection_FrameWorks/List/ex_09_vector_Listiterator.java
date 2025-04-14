package ex_15_Collection_FrameWorks.List;

import java.util.ListIterator;
import java.util.Vector;

public class ex_09_vector_Listiterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("shyam");
        vector.add("krishna");
        vector.add("mohan");

        ListIterator listIterator = vector.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("*-------*");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
