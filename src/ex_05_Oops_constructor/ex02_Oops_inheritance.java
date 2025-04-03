package ex_05_Oops_constructor;

public class ex02_Oops_inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.home();

        Son s1 = new Son();
        s1.home();
        s1.son();

        son1 s2 = new son1();
        s2.home();
        s2.son();
        s2.s2();
    }

}
class Father {

    void home(){
        System.out.println("Home");
    }

}
class Son extends Father{
    void son(){
        System.out.println("Shyam");

    }
    
}
class son1 extends Son{

    void s2 (){
        System.out.println("krishna");
    }

}
