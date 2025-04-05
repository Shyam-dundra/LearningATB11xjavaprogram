package ex_07_Oops_polymorphism.MethodOverriding;

public class ex_01_Oops_polymorphism {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();
        
        father f1 = new father();
        f1.home();

    }

}
class father{
    void home() {
    
        System.out.println("BHK2");
    }
}
class Son extends father{
    @Override
    void home() {
        
        System.out.println("BHK3");
    }
}
