package ex_07_Oops_polymorphism.MethodOverloading;

public class ex_01_Method_Overloading {
    public static void main(String[] args) {
        
        Mathoperations m1 = new Mathoperations();

        m1.add(6,7);
        m1.add(4,5,8);
        

    }

}
class Mathoperations{
         
    void add (int a, int b) {

        System.out.println(a+b);
    }
    void add(int a, int b, int c){

        System.out.println(a+b+c);
    }

}
