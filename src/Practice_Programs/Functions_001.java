package Practice_Programs;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Functions_001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arthematic arthematic = new Arthematic();
        System.out.println("Enter the int a value ");
        int a = sc.nextInt();
        System.out.println("Enter the int b value ");
        int b = sc.nextInt();
        System.out.println("Sum : " + arthematic.add(a, b));
        System.out.println("multiply : " + arthematic.multiply(a,b));

        Functions_001 functions = new Functions_001();
        Greeting greeting = functions.new Greeting();
        System.out.println(greeting.hello());
        greeting.name("shyam");

    }

   static class Arthematic {
       public int add(int a, int b) {
           return a + b;
       }

       public int multiply(int a, int b) {
           return a * b;
       }
   }
   class Greeting {
      public String hello() {
          return "Hello shyam";
      }
      public void name(String hello){
          System.out.println("Hi " + hello + " thanks ");
       }

   }
}
