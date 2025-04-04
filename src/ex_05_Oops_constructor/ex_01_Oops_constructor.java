package ex_05_Oops_constructor;

public class ex_01_Oops_constructor {
    public static void main(String[] args) {

        person1 p1 = new person1();
        p1.walk();
        p1.eat();
        p1.sleep();

        p1.Person_name("shyam");

        person1 p2 = new person1("Shyam",24,"88978194579");
        p2.walk();
        p2.eat();
        p2.sleep();
        p2.Details();


    }

}
class person1{
    String name;
    int age;
    String mobile;
    person1(){
        String name = "shyam";
        int age = 24;
        String mobile = "8897819574";

    }
    void walk(){

        System.out.println(name+"is walking");


    }
    void sleep(){
        System.out.println(this.name+"is sleeping");
    }
    void eat(){
        System.out.println(this.name+"is eating");
    }
    String Person_name(String name ){
        System.out.println("is "+ name);
        return name;
    }

    person1(String name, int age, String mobile){
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }
    void Details() {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Mobile number is "+ mobile);

    }


}

