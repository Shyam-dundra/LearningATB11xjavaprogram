package Tasks;

public class Task003_In_De_Operator {
    public static void main(String[] args) {

        int  a = 11;
        // Increment operator
        System.out.print("After Increment value is :  "   );
        System.out.println(++a + a++ + a++);
        // ++a - > A -> ExpA = 12 -> a=12
        // a++ - > B -> ExpB = 12 -> a=13
        // a++ - > C -> ExpC = 13 -> a=14
        System.out.println("After Increment a value is :  " + a);


        int  b = 12;
        // Decrement operator
        System.out.print("After Decrement value is :  " );
        System.out.println(--b + b++ + b--);
        // --b - > A -> ExpA = 11 -> b=11
        // b++ - > B -> ExpB = 11 -> b=12
        // b-- - > C -> ExpC = 12 -> b= 11
        System.out.println("After Decrement b value is :  " + b);
    }
}
