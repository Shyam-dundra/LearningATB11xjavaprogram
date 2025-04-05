package Tasks.Programs_4th_April;

import java.util.Scanner;

public class Ex_03_MaxNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a First_Number: ");
        int a = sc.nextInt();

        System.out.print("Enter a Second_Number: ");
        int b = sc.nextInt();
        number3 num = new number3(a,b);
        num.max();
       
        sc.close();

    }  

}

class number3{
    int num1;
    int num2;

   public number3(int num1, int num2){
        this.num1 = num1;
        this.num2   = num2;

    }
    void max(){
        if (this.num1 > this.num2){

            System.out.println("Entered Number is MAX: "+ this.num1);
            System.out.println("The minimum number is "+ this.num2);
        }
        else{
            if (this.num1 == this.num2){

                    System.out.println(" Given Number are Equal: ");

            }
            else{

                System.out.println("Given Number is Min: "+this.num1);
                
            }

        }

    }

}
