package ex_10_Access_Modifiers;

public class ex_10_Private_Access {
    public static void main(String[] args) {

        Private_Example USE = new Private_Example();
        USE.Access_secret_Method();

    }
}
class Private_Example {
    private void secret_method(){
        System.out.println("This is Private Method ");
    }
    public void Access_secret_Method(){
        secret_method();
    }
}
