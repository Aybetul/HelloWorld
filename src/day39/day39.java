package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class day39 {
    public static void main(String[] args) {
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18") );
      //  for (int i = 0; i <productLst.size() ; i++) {
       //     String proName = productLst.get(i).split(",")[0]; for loop version

        for (String each : productLst) {
         String proName=   each.split(",")[0];
            System.out.println(proName);
        }
//task 2 print price more than 500
         for (String each : productLst) {
                Double price = Double.parseDouble(each.split(",")[1]);
       if (price >500){
          System.out.println("items more than 500$    "+price);
          }

        }
         //Task 3 print average price

        double sum =0;
        Double average=sum/productLst.size();
        for (String each : productLst) {
            Double price = Double.parseDouble(each.split(",")[1]);
            sum += price;
        }
        System.out.println("Average   "+sum/productLst.size());


//Task 4 items monthly payment lees than 20
        for (String each : productLst) {
            Double monthly = Double.parseDouble(each.split(",")[2]);
            if (monthly < 20) {
                System.out.println("items monthly payment lees than 20 $ " + each.split(",")[0]);
            }
        }
//Task 5 iphone monthly payment
        for (String each : productLst) {
            if (each.split(",")[0].contains("iPhone")) {
                System.out.println(each.split(",")[0] + "----->" + each.split(",")[2]);
            }
        }
        // Task 6 most expensive item
Double max=Double.parseDouble(productLst.get(0).split(",")[1]);
String exItem="";
        for (int i=0;  i<productLst.size()-1;   i++) {
            if (Double.parseDouble(productLst.get(i).split(",")[1]) > max) {
max =Double.parseDouble(productLst.get(i).split(",")[1]);
exItem=productLst.get(i);
            }
        }
        System.out.println(exItem);
String ex="";
// second way,   for each loop
        for (String each : productLst) {
            if (Double.parseDouble(each.split(",")[1]) > max) {
                max = Double.parseDouble(each.split(",")[1]);
                ex = each;
            }
        }

        System.out.println(ex);

// Task    7 up date Dyson
   /*     int dysonIndex=0;
        for (int i = 0; i < productLst.size(); i++) {
            (  productLst.get(i).startsWith("Dyson") ){
                dysonIndex = i;
            }
        }  */

  //      for (int j = 0; j < productLst.size(); j++) {

            //  if (Double.parseDouble(productLst.get(j).split(",")[1]) > average) {
            //       productLst.remove(productLst.get(j));
            //       j--;

       // }
//String t=
      //  productLst.removeIf(t-> Double.parseDouble(t.split(",")[1]) > average);

    //    System.out.println(productLst);




    }}