package day63;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Set <String> lst=new HashSet<>(Arrays.asList(str.split(" ")));
        System.out.println(lst);
   Set<Character> lst2= new HashSet(Arrays.asList(str.split("")));
   System.out.println(lst2);
Set<Character> lst3= new TreeSet(Arrays.asList(str.split("")));
        System.out.println(lst3);
        Set<Character> lst4= new LinkedHashSet(Arrays.asList(str.replace(" ","").split("")));
        System.out.println(lst4);
        Set<Character> lst5= new HashSet(Arrays.asList(str.split("")));
        System.out.println(lst5);
        Set<Character> lst6= new HashSet(Arrays.asList(str.split("a")));
        System.out.println(lst6);
    }
}
