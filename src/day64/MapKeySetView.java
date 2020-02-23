package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);

        Set<String > allKeyNames=groceryPriceMap.keySet();
        allKeyNames.forEach(e-> System.out.println("each name "+e));

        for (String each: allKeyNames) {
            System.out.println("each name "+each);
            System.out.println("| value is " + groceryPriceMap.get(each));
        }




    }
}
