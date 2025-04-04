package ex_05_Oops_constructor;

public class ex_02_Default_constructor {
    public static void main(String[] args) {
        child c1 = new child();
        System.out.println(c1.age);
        System.out.println(c1.name);
        c1.display();

    }
}
class child {
    String name ;
    int age;

   child() {
       name = "shyam";
       age = 24;
   }
       void display() {
           System.out.println("Name is : " + name + ", Age is : " + age);
       }

}
