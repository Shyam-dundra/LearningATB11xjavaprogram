package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab002_User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the age  : ");
        int age = sc.nextInt();
        System.out.print("Enter the Birth year : ");
        long dob = sc.nextLong();

        System.out.println("Name is " +name + ", Age is " +age + ", Birth year is " +dob);
        System.out.println("Age is  " +age);
        System.out.println("Birth year is " +dob);

    }

}
