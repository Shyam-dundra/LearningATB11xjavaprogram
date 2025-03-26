package Tasks;

import java.util.Scanner;

public class Task005_Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side length " );
        int side1 = sc.nextInt();
        System.out.println("Enter second side length ");
        int side2 = sc.nextInt();
        System.out.println("Enter third side length ");
        int side3 = sc.nextInt();


        if(side1 == side2 && side2 == side3 ){
            System.out.println("Triangle is Equilateral");
        } else if (side1==side2 || side2 == side3 || side1 == side3) {
            System.out.println("Triangle is isosceles");
        }else {
            System.out.println("Triangle is scalene");
        }

    }
}
