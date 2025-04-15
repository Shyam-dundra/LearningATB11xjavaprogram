package ex_15_Collection_FrameWorks.Comparable;

import java.util.*;

public class ex_02_Comparable {
    public static void main(String[] args) {
       Parent p1 = new Parent("shyam", 23, 321);
       Parent p2 = new Parent("Apple",22,322);
       Parent p3 = new Parent("Mohan", 24, 320);

       List<Parent> list_All = new ArrayList<>();
       list_All.add(p1);
       list_All.add(p2);
       list_All.add(p3);

       Collections.sort(list_All);
       System.out.println(list_All);
    }

}
class Parent implements Comparable<Parent>{

    String name;
    int age;
    int num; 

    public Parent(String name, int age, int num){
        this.name=name;
        this.age=age;
        this.num=num;
    }

    @Override
    public String toString() {
        return "Parent [name=" + name + ", age=" + age + ", num=" + num + "]";
    }

    // public int compareTo(Parent other){
    //    return this.name.compareTo(other.name);
    // }

    // public int compareTo(Parent other){
    //     return this.age-other.age;
    //  }

     public int compareTo(Parent other){
        return this.num-other.num;
     }
}