package day63;

import javax.lang.model.SourceVersion;
import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
        Map<String, String>  nameStatePair=new HashMap<>();
        Map<String, Double >  itemPricePair=new HashMap<>();
        Map<String, Boolean> voterAndEligibilityPair=new HashMap<>();
        Map<String,Integer> gameScoreSAndScore=new HashMap<>();
        Map<Byte, Character> QuestionNumAndCorrectChoise=new HashMap<>();


        Map<String,Integer>nameAndAgePair=new HashMap<>();
        nameAndAgePair.put("Zehra",18);
        nameAndAgePair.put("Muhammet",21);
        nameAndAgePair.put("Malia",30);
        nameAndAgePair.put("Aidar",36);
        nameAndAgePair.put("Fatih",25);
        //when the key word is dublicate replace it with new one
        nameAndAgePair.put("Zehra",20);
        nameAndAgePair.put("esma",null);

        System.out.println("nameAndAgePair = " + nameAndAgePair);
        System.out.println("nameAndAgePair.size() = " + nameAndAgePair.size());
        System.out.println("Zehra's age "+nameAndAgePair.get("Zehra"));  //Zehra's age 20
        System.out.println(nameAndAgePair.containsKey("Aidar"));

        nameAndAgePair.putIfAbsent("Zehra",22); // After Java 8 // did not add zehra cuz we have it
        nameAndAgePair.putIfAbsent("Aybetul",35);
        System.out.println(nameAndAgePair);
        nameAndAgePair.replace("Malia",17);

        System.out.println("nameAndAgePair.get(\"Malia\") = " + nameAndAgePair.get("Malia"));
        System.out.println("nameAndAgePair.replace(\"Fatihhh\",45) = " + nameAndAgePair.replace("Fatihhh",45)); //"nameAndAgePair.replace(\"Fatihhh\",45) = " null
        //up the value if the old avlue equls to spesific value
        nameAndAgePair.replace("Zehra",20, 30);
        System.out.println("Zehra age " +nameAndAgePair.get("Zehra"));
        System.out.println( nameAndAgePair.replace("Zehraaaaa",20, 30)); // false
nameAndAgePair.remove("Fatih");
        System.out.println("nameAndAgePair.containsKey(\"Fatih\") = " + nameAndAgePair.containsKey("Fatih")); //false








    }
}
