package ex_01_Java_Basic;

import java.util.ArrayList;
import java.util.HashSet;

public class Lab009_HashSetExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("shyam");
        names.add("krishna");
        names.add("mohan");
        names.add("shyam");

        System.out.println("Hash set" + names);

        System.out.println("name contains 'shyam' " + names.contains("shyam"));

        names.remove("shyam");
        System.out.println("After removing 'shyam' "+ names);

        System.out.println("size of names "+ names.size());

        //you are given an array containing N integers where only one element is unique
        // (appears exactly once) while all others elements apear twice.
        // find and return the unique element. exzmple : input arr=[5,3,2,3,2] output:5

        HashSet<Integer> arr = new HashSet<Integer>();

        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(3);
        arr.add(2);

        HashSet<Integer> uniqueNumber = new HashSet<Integer>(arr);
        System.out.println("after removing "+ arr);

        System.out.println(arr);

    }
}
