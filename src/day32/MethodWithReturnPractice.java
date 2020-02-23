package day32;

import org.w3c.dom.ls.LSOutput;

public class MethodWithReturnPractice {
    public static void main(String[] args) {
        convertNumberToDay(6);
        System.out.println(convertNumberToDay(6));
        System.out.println("----test your code-----");
        int[] num = {2, 4, 7, 8, 5};
        for (int i = 0; i < num.length; i++) {
            System.out.println(convertNumberToDay(num[i]));
        }



        System.out.println("----return with switch and without break ");
        System.out.println(timeChecker(9));
    }

    public static String convertNumberToDay(int dayCode) {
        String day = "";
        switch (dayCode) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "FUNDAY";
        }
        return day;

    }

// we can use switch with return in this case we don't have to use break!!! de3    .l,0.-


    public static String timeChecker(int time){
        switch (time){
            case 7:
                return "get up";
            case 8:
                return "have breakfast";
            case 9:
                return "go work";
            default:
                return " sleep!!!";
        }
    }

}
