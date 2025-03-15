package Practice_Programs;

import java.util.Scanner;

public class Traiangle_001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side is "  );
        int side1 = sc.nextInt();
        System.out.println("Enter the length of second side is "  );
        int side2 = sc.nextInt();
        System.out.println("Enter the length of third side is "  );
        int side3 = sc.nextInt();

        if(side1 == side2 && side2==side3)
        {
            System.out.println("Given traingle is Equilateral");
        }else if(side1==side2 || side2==side3 || side1==side3) {
            System.out.println("Given triangle is Isosceles ");
        }else {
            System.out.println("Given Triangle is Scalene");
        }
    }
}
