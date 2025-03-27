package ex_03_Strings;

public class ex_12_Sb_CharAT {
    public static void main(String[] args) {

        //charAt(int index): Returns a character at a specified index

       String s = new String(greek()) ;
        System.out.println(s.charAt(4));
    }
    static String greek (){
        return "SHyam";
    }

}
