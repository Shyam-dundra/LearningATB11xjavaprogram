package Practice_Programs;

import java.util.HashMap;

class Frequency_string {
    public static void main(String[] args) {
        String input = "ShyamKrishnamohan";
        HashMap<Character, Integer> repeat = new HashMap<Character, Integer>();

        for (char n :input.toCharArray()){
            repeat.put(n, repeat.getOrDefault(n, 0)+1);
        }
        System.out.println("Frequency of 'a'" +repeat.getOrDefault("a", 0));
        System.out.println("frequency of 'y'" +repeat.getOrDefault("y", 0));

    }
}
