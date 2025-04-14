package ex_15_Collection_FrameWorks.List;

import java.util.ArrayList;

public class ex_04_List_Dynamic_Sizes {
    public static void main(String[] args) {
        ArrayList<Integer> num_List = new ArrayList<>();
        for (int i = 1; i <=5; i++) {
            num_List.add(i);
            System.out.println("Dynamic Sizes of Integers List : "+ num_List);
        }
    }
}
