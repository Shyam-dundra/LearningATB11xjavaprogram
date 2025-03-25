package ex_Strings;

public class ex_10_Sb_Capacity {
    public static void main(String[] args) {

        // until 16 it cannot add extra space in it

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("12345678912345678");
        System.out.println(sb.capacity());
    }
}
