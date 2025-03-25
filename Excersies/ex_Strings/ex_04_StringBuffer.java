package ex_Strings;

public class ex_04_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("shyam");
        stringBuffer.append("krishna");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        String s1 = "Hello ";
        String s2 = "World ";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s1);
        System.out.println(s2);
    }
}
