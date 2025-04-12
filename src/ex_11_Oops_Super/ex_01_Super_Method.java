package ex_11_Oops_Super;

public class ex_01_Super_Method {
    public static void main(String[] args) {
        child C1 = new child();
        C1.display();
        C1.show();
    }
}
class parent{
    void show () {
        System.out.println("This is a parent class");
    }
}
class child extends parent{
    @Override
    void show() {
        System.out.println("This is child class with parent method");
    }
    void display(){
        super.show();
    }
}
