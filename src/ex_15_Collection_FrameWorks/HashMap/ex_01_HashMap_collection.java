package ex_15_Collection_FrameWorks.HashMap;

import java.util.HashMap;

public class ex_01_HashMap_collection {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Grapes", 50);
        fruitPrices.put("orange", 30);

        System.out.println("Fruit Prices : "+fruitPrices);
        // Get value
        System.out.println("Price of Apple : "+fruitPrices.get("Apple") );
        //Get values of fruits using foreach
        for(String fruit : fruitPrices.keySet()){
            System.out.println(fruit+ " costs : " + fruitPrices.get(fruit));
        }
    }
}
