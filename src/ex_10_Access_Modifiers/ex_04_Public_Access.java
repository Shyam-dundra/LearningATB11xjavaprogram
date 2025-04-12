package ex_10_Access_Modifiers;

public class ex_04_Public_Access {
    public static void main(String[] args) {
        child c1 = new child();
        c1.display();
        parent  c2 = new parent();
        c2.display();
    }

}
class   parent{
    public void display(){
        System.out.println("This a parent class");
    }
}
class child extends parent{
    public void display(){
        System.out.println("This is a child class ");

    }
}
