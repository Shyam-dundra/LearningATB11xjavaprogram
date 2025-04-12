package ex_10_Access_Modifiers;

public class ex_09_Private_Access {
    public static void main(String[] args) {
        Person P1 = new Person();
        System.out.println("Name : "+ P1.getName());

    }
}
class Person{
    private String name = "Shyam";

    public String getName() {
        return name;
    }
}
