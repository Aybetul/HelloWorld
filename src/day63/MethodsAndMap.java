package day63;

import java.util.HashMap;
import java.util.Map;

public class MethodsAndMap {
    public static void main(String[] args) {
        String str = "I love java and java is fun ";
wordCount(str);



    }

           public static void wordCount (String word){
        String[] arr = word.split(" ");
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

