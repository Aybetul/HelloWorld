package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEntrySet {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);

        Collection<Double > allprices=groceryPriceMap.values();


        //remove the the value is more than 3
        //first way
    // allprices.removeIf(e -> e > 3);
        System.out.println(allprices);
      //  System.out.println(allprices.removeIf(e -> e > 3));
        System.out.println(groceryPriceMap);

        //second way
        Iterator<Double> itr= allprices.iterator();
//        while(itr.hasNext()){
//            if(itr.next()>3){
//                allprices.remove(itr.next());
//            }
//        }
//        System.out.println(allprices);







    }
}
