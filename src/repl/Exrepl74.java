package repl;

import java.util.Arrays;

public class Exrepl74 {
    public static void main(String[] args) {

    int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8

        int[] b = {1,2,3,4,5};
        mystery(b);
        for(int e : b)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 5

}
    public static double avgElements(int[] array)	{
        double sum=0;
        double av=0;
        for(double each : array ){
            sum +=each;
        }
        av=sum/array.length;
        return av;
    }

    public static void mystery(int[] array)
    {
       // int[] arrayNew= new int[array.length];
        for(int i =0; i<array.length; i++){
            if(array[i]%2==0){
                array[i]=array[i]/2;
            }else{
                array[i]=array[i]*10;
            }

        }
        System.out.println(Arrays.toString(array));
    }






}

