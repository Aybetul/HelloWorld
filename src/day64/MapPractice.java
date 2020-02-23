package day64;

import java.util.*;

public class MapPractice
{
    public static void main(String[] args) {


        // What if we want to have multiple value for one key ??
        // for example groupCode (bugHunter) -- group member names (abc, efg , htj , knl)
        // String         List<String>
        // key data type is String , value data type is List<String>
        Map<String, List<String> > groupMap = new HashMap<>();

        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));


groupMap.forEach((groupCode, members)-> System.out.println("groupCode+ \" members \"+members = " + groupCode+ " members "+members));
        System.out.println(groupMap.get("Achievers").get(3)); // tue
        // Task check Gulzina is in the list and print
        System.out.println(groupMap.get("BugHunter").contains("Gulzina")); // prints the name
        for(String each:groupMap.get("BugHunter")){
    if (each == "Gulzina") {
        System.out.println(each);
    }
// add new list and remove and a member to the list
   groupMap.put("Justice League", new ArrayList(Arrays.asList("Super man", "Batman", "Flash")));
    groupMap.get("Justice League").add("WonderWomen");
    groupMap.get("Justice League").remove("Batman");
            System.out.println(groupMap);



}






    }
}
