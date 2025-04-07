package ex_09_Oops_Abstraction;

public class Ex_01_Abstraction {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.draw();
        c1.display();

    }

}
abstract class shape{

    abstract void draw();

    void display(){
        System.out.println("This is a Shape");
    }

}
class Circle extends shape{

    void draw(){

        System.out.println("This is a Cicle");

    }

}
