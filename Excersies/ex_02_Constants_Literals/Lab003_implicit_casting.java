package ex_02_Constants_Literals;

public class Lab003_implicit_casting {
    public static void main(String[] args) {
        int num = 100;  // implicit casting smaller dt to bigger dt
        double db = (double) num;
        System.out.println("Integer value " + num);
        System.out.println("converted double value "+ db);
    }
}
