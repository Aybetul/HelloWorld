package akbarsTask;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1200));
    }
    public static boolean isLeapYear(int num ){
        if(num%400==0      || (num%4==0 && num%100!=0)){
        }
        return false;
    }
}
