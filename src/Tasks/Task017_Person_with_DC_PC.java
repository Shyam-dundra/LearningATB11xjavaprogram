package Tasks;

public class Task017_Person_with_DC_PC {
    public static void main(String[] args) {


        Person1 P1 = new Person1();
        System.out.println(P1.name);
        System.out.println(P1.age);
        System.out.println(P1.address);
        System.out.println(P1.mobile);
        System.out.println(P1.is_male);


        Person1 P2 = new Person1("shyam",24,"Delhi","8897819579",true);
        P2.walk();
        P2.sleep();
        P2.eat();

        Person1 P3 = new Person1("SHyam",24,"*897819579",true);
        P3.walk();
        P3.eat();
        P3.sleep();
        P3.Details();




    }
}
class   Person1{
    String name ;
  int age;
    String mobile;
    String address;
    boolean is_male;

    Person1(){
        name = "Shyam";
        age = 24;
        mobile = "8897819523";
        address = "Delhi";
        is_male = true;
    }
    void eat(){
        System.out.println(this.name + "is eating");
    }
    void sleep(){
        System.out.println(this.name+ "is sleeping");
    }
    void walk(){
        System.out.println(this.name+ "is walking");
    }
    Person1 (String name,int age, String address, String mobile, boolean is_male){
        this.name=name;
        this.age = age;
        this.address = address;
        this.mobile = mobile;
        this.is_male=is_male;
    }
    Person1(String name, int age, String mobile,boolean is_male){
        this.name =name;
        this.age =  age;
        this.mobile = mobile;
        this.is_male = is_male;

    }
    void Details() {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Address is "+address);
        System.out.println("Mobile number is "+ mobile);
        System.out.println(name + "is male " + is_male);

    }
}

