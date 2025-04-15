package ex_15_Collection_FrameWorks.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ex_04_Unique_Element {
    public static void main(String[] args) {
        String input = "shyamkrishnamohan";

        LinkedHashSet<Character> UniqueChars = new LinkedHashSet<>();

        for (int i = 0; i < input.length(); i++) {

            UniqueChars.add(input.charAt(i));
        }
        System.out.println("UniqueChars : " + UniqueChars);
    }
}
