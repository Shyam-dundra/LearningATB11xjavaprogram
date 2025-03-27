package ex_03_Strings;

public class ex_13_Sb_setChar {
    public static void main(String[] args) {

        // setCharAt(int index, char ch): Changes a character at a position

        StringBuffer sb = new StringBuffer("Shyam D");
        sb.setCharAt(5, '.');
        System.out.println(sb);
    }

}
