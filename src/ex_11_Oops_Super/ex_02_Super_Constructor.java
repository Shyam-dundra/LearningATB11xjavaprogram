package ex_11_Oops_Super;

public class ex_02_Super_Constructor {
    public static void main(String[] args) {
        son s1 = new son();

    }
}
class father {
    father(){
        System.out.println("This is a father class constructor");
    }
}
class son extends father{
    son(){
        super();

        System.out.println("This is a son class constructor");

    }
}
