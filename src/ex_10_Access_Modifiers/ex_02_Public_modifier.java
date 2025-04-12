package ex_10_Access_Modifiers;

public class ex_02_Public_modifier {
    public static void main(String[] args) {
        person Person = new person();
        System.out.println("Accessing public variable : "+ Person.name);
    }
}
class person{
    public String name = "shyam";

   public void display(){
       System.out.println("Name : "+ name);
   }
}

