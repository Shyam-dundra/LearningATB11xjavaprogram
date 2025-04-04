package ex_07_Oops_polymorphism.MethodOverloading;

public class ex_02_Overloading {
    public static void main(String[] args) {

        Grandfather G1 = new Grandfather();
        G1.num(6);
        G1.num(5,7);
        G1.num(3,6,8);
    }
}
class Grandfather {
    void num (int a){
        System.out.println(a);
    }
    void num (int a, int b){
        System.out.println(a+b);
    }
    void num (int a, int b, int c ){
        System.out.println(a+b+c);
    }

}
