package ex_Strings;

public class ex_08_Sb_delete {
    public static void main(String[] args) {
        // delete (start, end , str)

        StringBuffer sb = new StringBuffer("Shyam krishna");
        sb.delete(5,13);
        System.out.println(sb);

    }
}
