package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("src/day63/EmployeData.txt"));
        for (String each : allLines) {
            System.out.println("each = " + each);
        }
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (String each : allLines) {
            Integer id = Integer.parseInt(each.split(",")[0]);
            String name = each.split(",")[1];
            map.put(name, id);
            map2.put(id, name);
        }
        System.out.println("map = " + map);
        System.out.println("map2 = " + map2);
        System.out.println(map2.get(20));
// Char Count of your team members
        List<String> names = Arrays.asList("Selma", "Gulay", "Asena",
                "Sumeyye", "Tugba", "Vlad", "Kutluhan", "Taha", "Umit", "Aybetul", "Murat", "Bohuai");
        Map<String, Integer> map4 = new HashMap<>();
//        for (String each : names){
//            map4.put(each, each.length());
//        }
//
        names.forEach(each -> map4.put(each, each.length()));
        System.out.println("map4 = " + map4);
    }
}