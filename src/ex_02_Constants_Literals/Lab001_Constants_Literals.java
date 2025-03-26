package ex_02_Constants_Literals;

public class Lab001_Constants_Literals {
    public static void main(String[] args) {
        final int  a = 10; // int a value cannot be changed because of final keyword
        short b = 12 ;
       short  c = b++; // the value of b ic changed to 13
        System.out.println(b);
    }
}
