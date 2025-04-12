package ex_10_Access_Modifiers;

public class ex_11_private_Access {
    public static void main(String[] args) {
       Singleton s1 = Singleton.getInstance();


    }
}
class Singleton{
    private static Singleton instance;

    private Singleton (){
        System.out.println("Singleton Instance Created!");
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
