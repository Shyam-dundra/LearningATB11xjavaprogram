package ex_10_Access_Modifiers;

public class ex_01_public {
    public static void main(String[] args) {
        Public_Example P1 = new Public_Example();
        P1.show();


    }
}
class Public_Example{
    public void show(){
        System.out.println("Public access modifier");
    }
}
