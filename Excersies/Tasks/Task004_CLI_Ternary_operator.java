package Tasks;

public class Task004_CLI_Ternary_operator {
    public static void main(String[] args) {

        // CLI User input name age salary
        String name = String.format(args[0]);
        int age = Integer.parseInt(args[1]);
        long salary = Long.parseLong(args[2]);

        System.out.println("My Name is : " + name);
        System.out.println("My age is : "+ age);
        System.out.println("My salary is : "+ salary);

        // maximum number with ternary operator
        int num1 = Integer.parseInt(args[3]);
        int num2 = Integer.parseInt(args[4]);

        int max = (num1 > num2) ? num1 : num2 ;

        System.out.println("Maximum number is : "+ max);
    }
}
