package ex_Strings;

public class ex_03_StringBuilder_Vs_buffer {
    public static void main(String[] args) {

        String s1 = "Shyam";
        String s2 = new String("Krishna");

        StringBuffer s3 = new StringBuffer("Mohan");
        StringBuilder s4 = new StringBuilder("Shyam");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }
}
