package repl145;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Repl210 {
    public static void main(String[] args) {
        String word = " ght%%juxm(((  ";
        System.out.println(reverseLetters(word));

    }

    public static String reverseLetters(String word) {
        //
        String result = "";
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i)))
                temp.add("" + word.charAt(i));
        }
        Collections.reverse(temp);
        for (int i = 0, k = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                result += temp.get(k);
                k++;
            } else {
                result += word.charAt(i);
            }
        }
        return result;

    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        r.removeAll(Arrays.asList(n));
        return r;
    }

    public static String search(ArrayList<String> r, String find) {

        String result = "";
        for (String each : r) {
            if (each.contains(find)) {
                result = each;
            }
        }
        return result;
    }
    //create your method below


}



