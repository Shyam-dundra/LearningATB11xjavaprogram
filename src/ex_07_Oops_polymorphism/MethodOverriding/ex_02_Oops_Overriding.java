package ex_07_Oops_polymorphism.MethodOverriding;

public class ex_02_Oops_Overriding {
    public static void main(String[] args) {
        parent p1 = new child();
        p1.show();

        parent p2 = new parent();
        p2.show();
    }

}
class parent {
    void show(){
        System.out.println("Father");
    }
}
class child extends parent {
    void show (){
        System.out.println("Children");
    }
}
