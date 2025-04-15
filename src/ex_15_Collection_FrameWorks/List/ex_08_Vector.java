package ex_15_Collection_FrameWorks.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex_08_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector();

        v.add("shyam");
        v.add("krishna");
        v.add("mohan");

        System.out.println(v.contains("shyam"));

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("----- foreach loop");

        for (Object o : v){
            System.out.println(o);
        }

        System.out.println("------ iterator");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------ Enumeration");

        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("-------List Iterator");

        ListIterator  listIterator = v.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        System.out.println("\nBackward direction:");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }





    }
}
