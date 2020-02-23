package day32;

import java.util.Scanner;

public class arrayPracticeWithMethod {
    public static void main(String[] args) {
        arrayWithMethod(new int[]{1, 5, 8, 9, 54});
        int[] scores = {50, 64, 90};
        arrayWithMethod(scores);
        plus();
        System.out.println("elma\n"+"armut");
    }

    public static void arrayWithMethod(int[] manyNumbers) {
        for (int each : manyNumbers) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();
        System.out.println("result: " + (num1 + num2));
    }
}