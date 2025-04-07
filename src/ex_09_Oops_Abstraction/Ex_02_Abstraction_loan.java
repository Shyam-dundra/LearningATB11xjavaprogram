package ex_09_Oops_Abstraction;

public class Ex_02_Abstraction_loan {
    public static void main(String[] args) {
        child c2 = new child();

        c2.loan50K();
        c2.loan20K();

    }

}
abstract class Father {

    abstract void loan50K();

    void loan20K(){
        System.out.println("The loan amount is 20k");
    }
} 
class child extends Father{

    @Override
    void loan50K(){

        System.out.println("This child will be owner for Loan50K");
    }
}
