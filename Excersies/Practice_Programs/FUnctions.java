package Practice_Programs;

public class FUnctions {
    public static void main(String[] args) {

        //1. with parameters and without return
        main();
        shyam();

        //2. with parameter and without return
        String s = name();
        System.out.println(s);

        int age_to_vote = age();
        System.out.println("Age to vote " + age_to_vote);

        //3.with parameter and without return type
        name_greet("shyam");

        name_greet1("dundra","shyam");

        //4. with parameter and with return type
        int sum = sum_of_two_numbers(4,6);
        System.out.println("sum of two numbers : " +sum);

    }
    static void main(){
        System.out.println("New main method ");
    }
    //1. without parameters and without return
    static void shyam(){

        System.out.println("This is a shyam code ");
    }
    //2. without parameter and with return
    static String name(){

        return "My name is Shyam";
    }
    static int age (){
        System.out.println("calculate the age to vote : ");
        return 18;
    }
    //3.with parameter and without return type
    static void name_greet (String name){

        System.out.println("Hi your name is " + name);
    }
    static void name_greet1 (String firstname, String lastname ){

        System.out.println("Hi your name is " + firstname + " lastname "+ lastname);
    }

    //4. with parameter and with return type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

}
