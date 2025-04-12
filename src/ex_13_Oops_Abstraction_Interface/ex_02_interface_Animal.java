package ex_13_Oops_Abstraction_Interface;

public class ex_02_interface_Animal {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.sound();

        Dog d1 = new Dog();
        d1.sound();

    }
}
interface Animal{
    void sound();

}
class cat implements Animal{

    @Override
    public void sound() {
        System.out.println("Cat sounds like meows...");
    }
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Dog sounds like bow bow...");
    }
}