package repl145;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReplRevertheArrayList {

    private static Object Utils;

    public static void main(String[] args) {

       /* String result = Utils.reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = Utils.reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false  */

String str=" ght%%juxm(((  ";
String result ="";
        List<String> temp= new ArrayList<>();
        for(int i=0 ;i<str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                temp.add("" + str.charAt(i));
        }
        Collections.reverse(temp);
        for (int i = 0 , k=0 ; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                result+=temp.get(k);
                k++;
            }else {
                result+=str.charAt(i);
            }

        }

        System.out.println(result);


    }
    public static void test(ArrayList<String> words)
    {
        //write code here
        words.add(0,"hey");
        words.add(2,"yo");

        System.out.println(words);

    }
    public static int[] do_switch(int[] i)
    {
        int first=i[0];
        int last=i[i.length-1];
        i[0] =last;
        i[i.length-1]=first;

        return i;
    }
}