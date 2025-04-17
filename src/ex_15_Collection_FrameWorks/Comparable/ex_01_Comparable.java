package ex_15_Collection_FrameWorks.Comparable;

import java.util.*;
import java.sql.Struct;
import java.net.CookieHandler;
import java.util.Collections;



public class ex_01_Comparable {
    public static void main(String[] args) {
        
        Student s1 = new Student(21,"Shyam",22);
        Student s2 = new Student(22,"Krishna",25);
        Student s3 = new Student(23,"Mohan",24);

        List<Student> Student_List = new ArrayList<>();
        Student_List.add(s1);
        Student_List.add(s2);
        Student_List.add(s3);

        Collections.sort(Student_List);
        System.out.println(Student_List);
        
    }

}
class Student implements Comparable<Student>{
    private int roll_no;
    private String name;
    private int age;

    public Student(int roll_no, String name, int age){
        this.name=name;
        this.roll_no=roll_no;
        this.age=age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    
    }

                   
    @Override
    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }

    // @Override

    // public int CompareTo(Student o){
    //     return this.roll_no-o.roll_no;
    // }

    // @Override

    // public int CompareTo(Student o){
    //     return this.age-o.age;
    // }


    
}




