package Tasks.Programs_4th_April;

import java.util.Scanner;

public class Ex_05_VoteAge {
    public static void main(String[] args) {
       try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter the age to check Eligible for vote: ");
            person p1 = new person(sc.nextInt());
            p1.VotetoAge();
            System.out.println("Age is " + p1.age);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Please Enter valid age ");
        }
    }

}
class person{
    int age;

    person(int age ){
        this.age = age;

    }
    void VotetoAge (){
        if (age >=18){
        
            System.out.println("Your are age is Eligible to vote ");
        }else{

            System.out.println("You are age is not Eligible for vote");
        }
    }
    
}
