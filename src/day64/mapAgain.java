package day64;

import java.util.*;

public class mapAgain {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();

        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);

        //we can use ketSet() method of map to get set of item
      Set<String > allKeyNames=groceryPriceMap.keySet();
        System.out.println(allKeyNames);
        allKeyNames.remove("Tomato"); // this step affects  the original map
      //  System.out.println(allKeyNames);
        System.out.println(groceryPriceMap);

        // not to affect the original map we create a new map
        Set <String > namesCopy= new HashSet<>(allKeyNames);
     //   Set <String > namesCopy= new HashSet<>(groceryPriceMap.keySet());
        namesCopy.remove("Tomato");
        System.out.println(namesCopy);
        System.out.println(groceryPriceMap);






    }
}
