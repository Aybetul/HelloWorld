package day64;

import java.util.*;

public class MapValueView {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);

        Collection<Double > allprices=groceryPriceMap.values();
        allprices.remove(1.99);
        System.out.println(allprices); // remove the tomato from the map  cuz it is the first item in the map with the price 1.99
    }
}
