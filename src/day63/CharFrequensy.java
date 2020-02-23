package day63;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharFrequensy {
    public static void main(String[] args) {
        String str= "AAAAABBBBBACCCCRDDDDD";
        Map<Character,Integer>  charFreq=new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if(!charFreq.containsKey(str.charAt(i))){
                charFreq.put(str.charAt(i),1);
            }else{
                charFreq.replace(str.charAt(i),charFreq.get(str.charAt(i))+1);
            }

        }
        System.out.println(charFreq);
    }

}
