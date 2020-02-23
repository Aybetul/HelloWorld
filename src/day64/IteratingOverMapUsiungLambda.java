package day64;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverMapUsiungLambda {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);

        groceryPriceMap.forEach((name,price)-> System.out.println("name"+name+"price="+price));

    }
}
