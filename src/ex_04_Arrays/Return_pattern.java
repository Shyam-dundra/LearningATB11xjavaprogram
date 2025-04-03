package ex_04_Arrays;

import Practice_Programs.star_pattern;

public class Return_pattern {
    public static void main(String[] args) {

        Square_Pattern();

//         right_triangle_reverse();

//        right_triangle();
     // right_triangle_Number();
       // right_triangle_Same_Number();
//         right_triangle_01();
//         right_triangle_02();

        // right_triangle_pyramid();
//        down_triangle();
//        Max_num();

    }

    public static void Square_Pattern() {
        System.out.println("Square_Pattern");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("* ");
            System.out.println();
        }

    }

    public static void right_triangle_reverse() {
        System.out.println("right_triangle_Reverse");
        int n = 3;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) System.out.print("* ");
            System.out.println("");
        }
    }
    public static void right_triangle() {
        System.out.println("right_triangle");
        int n = 4;
        for (int i = 0; i< n; i++) {
            for (int j = 0; j<i+1; j++) System.out.print("* ");
            System.out.println(" ");
        }
    }
    public static void right_triangle_Number() {
        System.out.println("right_triangle_Number");
        int n = 4;
        for (int i = 0; i< n; i++) {
            for (int j = 0; j<i+1; j++) System.out.print(j+1);
            System.out.println(" ");
        }
    }
    public static void right_triangle_Same_Number() {
        System.out.println("right_triangle_Same_Number");
        int n = 4;
        for (int i = 0; i< n; i++) {
            for (int j = 0; j<i+1; j++) System.out.print(i+1);
            System.out.println(" ");
        }
    }
    public static void right_triangle_01() {
        System.out.println("right_triangle_Same_Number");
        int n = 4;
        for (int i = 0; i< n; i++) {
            for (int j = n; j>i; j--) System.out.print("* ");
            System.out.println(" ");
        }
    }
    public static void right_triangle_02() {
        System.out.println("right_triangle_Same_Number");
        int n = 4;
        for (int i = 0; i< n; i++) {
            for (int j = n; j>i; j--) System.out.print(n-j+1);
            System.out.println(" ");
        }
    }
    public static void right_triangle_pyramid() {
        System.out.println("right_triangle_Same_Number");
        int n = 5;
        int  stars = 1;
    
        for (int i = 0; i< n; i++) {
            for (int j = 0; j<n-i; j++) System.out.print(" ");
            for (int k = 0; k <stars ; k++) {
                System.out.print("*");
            }
            stars +=2;
            System.out.println();
        }
    }
    static void down_triangle(){
        int n= 4;
        for (int i = n; i >=1; i--) {
            for (int j = n; j>i; j--) {

                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j);

            }
            System.out.println();


        }
    }
    public static void Max_num(){
        int [] arr ={10, 25,46,43,67,87};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        for (int num : arr){
            if (num > max ){
                max = num;
            }
        }
        System.out.println(max);
    }

}