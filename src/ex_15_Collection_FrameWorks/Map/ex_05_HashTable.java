package ex_15_Collection_FrameWorks.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class ex_05_HashTable {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(10, "Shyam");
        ht1.put(11, "Krishna");
        ht1.put(13, "Mohan");

        System.out.println(ht1);
        
        Enumeration <Integer> e  = ht1.keys();
            while(e.hasMoreElements()){
               System.out.println(e.nextElement()); 
            }
    }

}
