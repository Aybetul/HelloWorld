package day32;

public class birthYear {
    public static void main(String[] args) {

        System.out.println(ageCalculator(1945));
  int[] age =     {1999,122,2019, 1987, 1978,1964,3999, 2004};
  for(int each :age){
      System.out.println(ageCalculator(each));
  }
    }
    public static String ageCalculator(int year){
        if (year>1900 && year<=2019){
        return   ""  + (2019-year);
        }else{
            return "invalid";
        }


    }
}
