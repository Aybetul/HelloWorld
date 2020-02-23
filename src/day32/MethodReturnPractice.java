package day32;

public class MethodReturnPractice {
    public static void main(String[] args) {
int result =addNums(10,45);
        System.out.println(addNums(10,45));
        System.out.println(result);
        System.out.println(" ------create email----- ");
        System.out.println(getEmail("Metin", "caliskan"));
        System.out.println(" -----use getemail method with given info-------");
        String fullName="Akif Caliskan";
        String part1=fullName.split(" ")[0];
        String part2=fullName.split(" ")[1];
        System.out.println(getEmail(part1,part2));
    }
    public static int addNums (int num1,int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
   public static String getEmail(String name,String lastname){
       // String email = name.charAt(0)+lastname+"@hotmail.com";
     //  return email;
       return name.charAt(0)+lastname+"@hotmail.com";

   }


}
