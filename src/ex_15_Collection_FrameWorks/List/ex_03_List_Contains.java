package ex_15_Collection_FrameWorks.List;

import java.util.ArrayList;

public class ex_03_List_Contains {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        for (int i = 0; i <colors.size() ; i++) {
            if (colors.contains("Blue")){
                System.out.println("The blue color is exists in the List");
                break;
            }
            else {
                System.out.println("The color not contains in List");
            }
        }
        System.out.println("Colors List : "+ colors);

    }
}
