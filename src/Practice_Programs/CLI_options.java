package Practice_Programs;

public class CLI_options {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
        String name = String.format(args[0]);
        int age =Integer.parseInt(args[1]);
        long salary = Long.parseLong(args[2]);

        System.out.println("My name is " +  name);
        System.out.println("My age is  " + age);
        System.out.println("My salary is " + salary);

    }
}
