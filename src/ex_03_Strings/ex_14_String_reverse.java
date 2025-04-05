package ex_03_Strings;


public class ex_14_String_reverse {
    public static void main(String[] args) {
        
        String input = "Hello Shyam";
        String reverse_input = "";

        for (int i = input.length()-1;i >= 0;i--) {

            reverse_input += input.charAt(i);
        }
        System.out.println("revrse string: " + reverse_input);

    }

}
