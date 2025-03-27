package ex_03_Strings;

public class ex_11_Sb_ensureCapacity {
    public static void main(String[] args) {
        //space it has 16 min after filling the 16 it doubles the storage

        StringBuffer sb = new StringBuffer();
        sb.ensureCapacity(17);
        System.out.println(sb.capacity());
    }
}
