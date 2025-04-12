package Tasks.Programs_5th_April;

import java.util.Scanner;

public class ex_10_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter the amount to withdraw : ");
        int withdraw = sc.nextInt();

        if(withdraw <= 0 ){
            System.out.println( "❌ Error: Amount must be greater than zero.");
        } else if (withdraw %100 != 0) {
            System.out.println("❌ Error: Amount must be a multiple of 100.");
        }else if (withdraw > balance){
            System.out.println("❌ Error: Insufficient balance.");
        }else {
            balance -= withdraw;

            System.out.println("✅ Withdrawal successful! You withdrew ₹" + withdraw);
            System.out.println("Remaining balance " + balance);
        }
        sc.close();
    }
}
