package day64;

import java.util.*;

public class TableData {

    public static void main(String[] args) {

        // for single row
        // i want to get the value by it's column name
        // so i choose Map

        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "Female");

        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "cmorillas1@blog.com");
        row2.put("gender", "Female");

        // for one row I used one mapme
        // but I have many rows !
        // may of Some type -->> List<SomeType>
        List<Map<String, String >> rowMapLst= new ArrayList<>();
        rowMapLst.add(row1);
        rowMapLst.add(row2);
        System.out.println(rowMapLst);
        System.out.println(rowMapLst.get(1).get("email"));
        System.out.println(rowMapLst.get(0).put("first_name", "Hulk"));



    }
}