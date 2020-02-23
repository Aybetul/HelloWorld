package day32;

import java.util.Scanner;

public class returnWillTerminateTheMethod {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number more than ten ");
        int num =scan.nextInt();
        if(num<10){
             return;    // if the condition is true it will exit!
            // if not will print happy holidays

        }

        System.out.println("happy holidays");
    }


}
