package ex_01_Java_Basic;

import java.awt.*;
import java.lang.reflect.Array;

public class Lab010_StringConcat {
    public static void main(String[] args) {

        String str1 = "Shyam";
        String str2 = "Krishna";
        String str3 = "Mohan";

        System.out.println(str1+(str2+str3));
        System.out.println(str1+" "+str2+ " " + str3);

        char char1 ='a';
        char char2 = 'b';
        char char3 = 'c';

        System.out.println(char1+char2);
        System.out.println(char1+ " "+ char2+ " " + char3 );
        System.out.println( (char2+char3) + " "+ char3 );

        int[]  arr = new int[]{9,9,2,3,2};

        for (int i = 0; i < arr.length-4; i++) {

            System.out.println(arr[0]);

        }
    }
}
