package ex_11_Oops_Super;

public class ex_03_Super_variable {
    public static void main(String[] args) {
        child1 C2 = new child1();
        C2.display();


//        son s1 = new son();
    }
}
class Parent1{
    String name = "Parent Name";
}
class child1 extends Parent1{
    String name = "Child name ";

    void display(){

        System.out.println("Child class name : " + name);
        System.out.println("Parent class name : "+ super.name);
    }
}
