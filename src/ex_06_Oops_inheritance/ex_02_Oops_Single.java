package ex_06_Oops_inheritance;

public class ex_02_Oops_Single {
    public static void main(String[] args) {

        child c1 = new child();
        c1.show();
        c1.display();

        Parent1 P1 = new Parent1();
        P1.display();

    }
}
class Parent1 {
    void display(){
        System.out.println("This is parent class");
    }
}
class child extends Parent1 {
    void show (){
        System.out.println("This is child class");
    }
}