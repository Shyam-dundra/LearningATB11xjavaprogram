package ex_10_Access_Modifiers;

public class ex_06_Public_Access {
    public static void main(String[] args) {
        ex_05_Public_Access P3 = new ex_05_Public_Access();
        System.out.println("Name : "+ P3.name);
        System.out.println("Age : "+ P3.age);
    // Accessing ex_12_ private_method
        outer_class in = new outer_class();
        in.create_inner();

        //Accessing ex_11_private_method
        Singleton s2 = Singleton.getInstance();
    }
}
