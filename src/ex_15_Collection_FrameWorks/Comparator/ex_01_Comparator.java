package ex_15_Collection_FrameWorks.Comparator;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class ex_01_Comparator {

    public static void main(String[] args) {
        
        Student1 s1 = new Student1("Apple", 25, 13);
        Student1 s2 = new Student1("Grapes", 24, 14);
        Student1 s3 = new Student1("Banana", 23, 12);

        List<Student1> student_list = new ArrayList<>();
        student_list.add(s1);
        student_list.add(s2);
        student_list.add(s3);

        Collections.sort(student_list, new RollComparator());
        System.out.println(student_list);

    }

}
class Student1 {
    private int age;
    private String name;
    private int rollNo;

    public Student1(String name, int age, int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student1 [age=" + age + ", name=" + name + ", rollNo=" + rollNo + "]";
    }
}

class AgeComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2){
        return o1.getAge()-o2.getAge();
    }
}

class NameComparator implements Comparator<Student1>{

    public int compare(Student1 o1, Student1 o2){
        return o1.getName().compareTo(o2.getName());
    }
}

class RollComparator implements Comparator<Student1>{

    public int compare(Student1 r1, Student1 r2){
        return r1.getRollNo()-r2.getRollNo();
    }

}


