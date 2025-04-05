package ex_06_Oops_inheritance;

public class ex_04_Hierarchical {

    public static void main(String[] args) {
        // child2 c2 = new child2();

        // System.out.println("Below functions are belongs to child2 class");
        // c2.display();
        // c2.show2();

        // child1 c1 = new child1();
        // System.out.println("Below functions are belongs to child1 class");
        // c1.display();
        // c1.show1();

        // parent p2 = new parent();
        // System.out.println("Below functions are belongs to parent class");
        // p2.display();

        // parent p1 = new child2();
        // p1.display();

        child2 c1 = new child2();
        c1.show2();
    }
}
class parent {
    void display () {
        System.out.println("This is parent class");
    }
}
class child1 extends parent {
    void show1(){
        System.out.println("This is child1 class");
    }
}
class child2 extends parent {
    void show2 (){
        super.display();
        System.out.println("This is child2 class");
    }
}