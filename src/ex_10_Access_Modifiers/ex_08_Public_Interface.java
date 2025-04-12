package ex_10_Access_Modifiers;


public class ex_08_Public_Interface {
    public static void main(String[] args) {

        use u1 = new use();

        u1.great();
        u1.defaultMethod();
        Public_Interface.Static_method();
    }
}
interface Public_Interface{
    void great();

    static void Static_method(){
        System.out.println("This is a static method in a public interface.");
    }

    default void defaultMethod() {
        System.out.println("This is a default method in a public interface");
    }


}
class use implements Public_Interface{
    @Override
    public void great() {
        System.out.println("Implementing greet() method");
    }

}
