package ex_Strings;

public class ex_06_Sb_Insert {
    public static void main(String[] args) {
        //insert(int index, String s): Inserts text at a given position

        StringBuffer sb = new StringBuffer("Shkrishna");
        sb.insert(2, "yam " );
        System.out.println(sb);
    }
}
