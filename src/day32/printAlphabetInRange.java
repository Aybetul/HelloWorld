package day32;

public class printAlphabetInRange {
    public static void main(String[] args) {
        printAlphabetInRange('A','Z');
        printAlphabetInRange('e', 'k');
        printAlphabetInRange('z', 'f');
    }
    public static void printAlphabetInRange(char beginning  ,char end ){
        if(beginning<end) {
            for (char i = beginning; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else if(beginning>end ){
            for (char i = beginning; i >=end ; i--) {

                System.out.print(i+"  ");

            }
            System.out.println();
        }else {
            System.out.println("beginning and end same!!");
        }
        System.out.println();

    }





}
