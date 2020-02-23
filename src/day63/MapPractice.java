package day63;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

     //   public static void wordCount (String str){
        String str = "I love java and java is fun ";
            String[] arr = str.split(" ");
            Map<String, Integer> wordCountpair = new HashMap<>();
            for (String each : arr) {
                if (!wordCountpair.containsKey(each)) {
                    wordCountpair.put(each, 1);
                } else {
                    wordCountpair.replace(each, wordCountpair.get(each) + 1);
                }
            }
            System.out.println("wordCountpair = " + wordCountpair);
        }
    }

