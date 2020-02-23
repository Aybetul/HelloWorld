package day32;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class StringAction {
    public static void main(String[] args) {
     reverseMyName();
     spellWithDash("Aybetul");
    spellWithDash("Akif");
    printAtoZ();
    printZtoA();

    }
    public static void reverseMyName() {
        String name = "Aybetul";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));

        }
    }
        public static void spellWithDash(String name){
            for (int i = 0; i <name.length() ; i++) {
                System.out.print(name.charAt(i));
                System.out.print("-");

            }
            System.out.println();
        }
public static void printAtoZ() {
    for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
        System.out.print(iChar + " ");

    }
}
    public static void printZtoA(){
        for (char i ='Z' ; i <='A' ; i--) {
            System.out.print(i+" ");

        }
    }




}
