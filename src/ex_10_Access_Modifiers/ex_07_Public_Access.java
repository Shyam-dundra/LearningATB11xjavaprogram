package ex_10_Access_Modifiers;

public class ex_07_Public_Access {
    public static void main(String[] args) {
        //singleton s1 = new singleton();
        singleton.show_message();
    }

}
class singleton {
    private singleton() {
        System.out.println("Singleton instance created");
    }
    public static void show_message(){
        System.out.println("Public method inside private constructor class.");
    }
}
