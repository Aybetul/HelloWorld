package akbarsTask;

import java.util.ArrayList;

public class AkbarsTask {
    public static void main(String[] args) {
       /* Given a ArrayList of 6 Integer 1,3,7,2,12,7
        insert 100 in between each numbers
        For example :
        1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7

        Optionally make it a method
        write a static void method that accept a ArrayList of integer object and insert 100 in between items.*/
       ArrayList<Integer> arr =new ArrayList<>();
       arr.add(1);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(12);
        arr.add(7);

       Add100(arr);
    }

    public static void  Add100 (ArrayList<Integer  > n ){

        for (int i = 1; i <n.size() ; i+=2) {
            n.add(i,100);
        }
        System.out.println(n);
        ArrayList<String> students=new ArrayList<>();
        students.add("al");
        students.add("u");
        students.add("JoseGonzalez");
        students.add("Jasmin");
        students.add("Joannah");
        students.add("Sarah");
       nameMethod(students);

    }

  /*  Given List of names with various character count,
    Remove any name with less than 2 characters
    and if any name has more than 10 character only keep 10 characters
    and if it has exactly 5 characters , reverse it
    Of course , Otionally make a method out of it.*/
public static void nameMethod(ArrayList <String> names){
    String reverse="";
    for(int i=0 ; i<names.size() ;i++){
        if(names.get(i).length()<2){
            names.remove(names.get(i));
            i--;
        }else if (names.get(i).length()>10){
         String m= names.get(i).substring(0,10);
names.set(i,m);
        }else if (names.get(i).length()==5){
            for (int j = names.get(i).length()-1 ; j >=0 ; j--) {

                reverse+=""+ names.get(i).charAt(j);
            }
             names.set(i,reverse);
            }
        }
    System.out.println(names);
    }
}



