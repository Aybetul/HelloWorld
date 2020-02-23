package repl145;

import java.util.Scanner;

public class Repl157 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {


            String[] arr=s.split(":");
            if(arr[2].contains("AM")){
                if(arr[0].equals(12)  ){
                arr[0]="00";}
                System.out.println((arr[0])+":"+arr[1]+":"+arr[2].substring(0,2));
            }

            if(arr[2].contains("PM")){
                char[] newArr0=arr[0].toCharArray();
                if(newArr0.length==1) {

                    System.out.println((newArr0[0] + 12) + ":" + arr[1] + ":" + arr[2].substring(0, 2));
                }
                if(arr[0].equals(10)){
                    System.out.println(22 + ":" + arr[1] + ":" + arr[2].substring(0, 2));
                }
               if(arr[0].equals(11)) {
                    System.out.println(23 + ":" + arr[1] + ":" + arr[2].substring(0, 2));
                }
        }
    }
}
