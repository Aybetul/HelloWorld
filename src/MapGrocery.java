import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapGrocery {
    public static void main(String[] args) {
        Map<String,Double> itemPricePair= new HashMap<>();
        itemPricePair.put("Tomato", 1.63);
        itemPricePair.put("Banana", 0.43);
        itemPricePair.put("Orange", 2.67);
        itemPricePair.put("Cheese", 6.89);
        itemPricePair.put("Bread", 3.67);
        itemPricePair.put("Nuts", 10.00);
        itemPricePair.put("Bread", 2.78); // update the list now this one in the map
        itemPricePair.putIfAbsent("Milk",2.45 );
        System.out.println("itemPricePair = " + itemPricePair);

        System.out.println("Orange price is "+itemPricePair.get("Orange"));

        itemPricePair.replace("Tomato", 1.63,(1.63*2)); // double tomato price
        itemPricePair.replace("Tomato", itemPricePair.get("Tomato")-1); // minus tomato price
        System.out.println("itemPricePair.get(\"\") = " + itemPricePair.get("Tomato"));

        System.out.println("double tomata price "+itemPricePair.get("Tomato")*2); // this one doesn't save in the map just prints
        itemPricePair.replace("Bread", 3.67, (3.67*2));
        System.out.println("itemPricePair = " + itemPricePair);

        itemPricePair.remove("Tomato");

        System.out.println("itemPricePair = " + itemPricePair);
    }

}
