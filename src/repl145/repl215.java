package repl145;

import java.util.ArrayList;
import java.util.Arrays;

public class repl215 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(twoTimes(a));
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> lst){
       // ArrayList<Integer> lst2=new ArrayList<>(lst);
       // int s=lst.size()*2;
        for(int i=0; i<lst.size() ;i +=2){
            lst.add(i, lst.get(i));
        }
        return lst;
    }
    public static boolean badP(int[] products,int limit)
    {
        int count=0;
        for(int each:products) {
            if(each==0){
                count++;
            }
        }
        return (count<limit);
    }

}


