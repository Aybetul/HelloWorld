package day64;

import java.util.*;

public class MapEntrySet2 {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);

// lambda only prints the each item
        // map is not iterable but this way we make it iterable and modify it
        // this way we iterate the map and modify it ,
        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();
        for(Map.Entry<String, Double> each:entryView){
    if(each.getKey().length()==5){
        each.setValue(15.0);
    }
}
        System.out.println(groceryPriceMap);
   //short way
      //  groceryPriceMap.forEach((name,price)-> System.out.println("name"+name+"price="+price));






    }
}
