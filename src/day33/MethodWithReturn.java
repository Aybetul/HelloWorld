package day33;

public class MethodWithReturn {
    public static void main(String[] args) {
     //   String result =reverseIt("computer");
     //   System.out.println(result  ); ;
    }
    public static String reverse(String str){
        String reverseIt="";
        for (int i = str.length()-1   ; i <=0 ; i--) {
            reverseIt +=str.charAt(i);
        }
        return reverseIt;
    }


}
