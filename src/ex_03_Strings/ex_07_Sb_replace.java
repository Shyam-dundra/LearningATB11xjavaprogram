package ex_03_Strings;

public class ex_07_Sb_replace {
    public static void main(String[] args) {
        //replace(int start, int end, String s): Replaces a substring


        StringBuffer sb = new StringBuffer("shyam mohan");
        sb.replace(6,13, "krishna" );
        System.out.println(sb);


    }
}
