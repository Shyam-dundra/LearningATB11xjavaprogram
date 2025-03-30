package ex_04_Arrays;

import java.util.Arrays;

public class ex_06_Arrays_Print {
    public static void main(String[] args) {
//        int[] marks = {45, 56, 44, 57, 89, 96};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        Arrays.sort(marks);
//        for (int num : marks)
//
//        System.out.print(num + " ");

//        for (int i = 0; i <marks.length ; i++) {
//           if (i == marks.length-1){
//               System.out.print(marks[i]);
//
//           }else{
//               System.out.print(marks[i] + ",");
//           }
//
//
//       }

        Marks_coma();
        Marks_Array();
        System.out.print("Array sort :");
        Array_sort();

    }

    public  static  void Marks_coma() {
        int[] marks = {45, 56, 44, 57, 89, 96};
        for (int i = 0; i < marks.length; i++) {
            if (i <= 0) {
                System.out.print("[" + marks[i]);

            } else if (i == marks.length - 1) {
                System.out.println("," + marks[i] + "]");

            } else {
                System.out.print("," + marks[i]);
            }

        }
    }
    public  static  void Marks_Array() {
        int[] marks = {45, 56, 44, 57, 89, 96};
        for (int i = 0; i < marks.length; i++) {
            if (i <= 0) {
                System.out.print("[" + marks[i]);

            } else if (i == marks.length - 1) {
                System.out.println(" " + marks[i] + "]");

            } else {
                System.out.print(" " + marks[i]);
            }

        }
    }
    static void Array_sort(){
        int[] marks = {45, 56, 44, 57, 89, 96};

        Arrays.sort(marks);

        for (int num : marks){
            System.out.print( " "+num );
        }
    }
}
