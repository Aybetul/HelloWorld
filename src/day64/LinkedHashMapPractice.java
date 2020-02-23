package day64;

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        // it keeps  insertion order
        Map<String, Double> groceryMap=new LinkedHashMap<>();
        groceryMap.put("tomato", 2.88);
        groceryMap.put("banana", 0.45);
        groceryMap.put("bread", 3.34);
        groceryMap.put("milk", 2.89);
        System.out.println("LinkedHashMap "+groceryMap);

// it gives only key value sorted order
        Map<String, Double> groceryMap2=new TreeMap<>();
        groceryMap2.put("tomato", 2.88);
        groceryMap2.put("banana", 0.45);
        groceryMap2.put("bread", 3.34);
        groceryMap2.put("milk", 2.89);
        System.out.println(groceryMap);
        System.out.println("TreeMap groceryMap2 = " + groceryMap2);

    }
}
