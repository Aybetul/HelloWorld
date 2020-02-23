package akbarsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToChar {
    public static void main(String[] args) {
        String word= "Where are you Winter!!";
        strToCharList(word);
        String scores ="748bn268";

        System.out.println(   isNumberOnly(scores));
        List<String > scr =new ArrayList<>();
        scr.add("89");
        scr.add("78");
        scr.add("56");
        scr.add("43");
       isNumberList(scr);
        List<Integer > nums =new ArrayList<>();
        nums.add(89);
        nums.add(32);
        nums.add(1);
        nums.add(45);
        nums.add(90);
        nums.add(41);
        nums.add(5);
        nums.add(9);
       swap(nums);
    }
    public static void strToCharList (String word){

        List<Character > strToChar= new ArrayList<>();
        for (int i = 0; i <word.length() ; i++) {
            strToChar.add(word.charAt(i));
        }
        System.out.println(strToChar);
    }
    public static Boolean  isNumberOnly (String str){
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                count++;
            }

        }
        if (count ==str.length()) {
           return true;
        }
        return false;
    }

    public static  void isNumberList (List<String> nums){
        int count=0;
        for (String num : nums) {
            isNumberOnly(num);
            count++;
        }
       if (count == nums.size()) {
           System.out.println(true);
       }else {
           System.out.println(false);
       }
    }
public static void swap(List<Integer> nums){
        int temp=0;
    for (int i = 1; i <nums.size()/2+1 ; i++) {
        temp=nums.get(i-1);
        nums.set(i-1,nums.get(nums.size()-i));
        nums.set((nums.size()-i),temp);
    }
    System.out.println(nums);
}

}
