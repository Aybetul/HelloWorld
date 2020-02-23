package day32;

public class returnValue {
    public static void main(String[] args) {
    String spelledName=  spellMyName("Aybetul")  ;
        System.out.println(spelledName);
        System.out.println(spellMyName("Aybetul"));
    }
    public static String spellMyName(String name){
     String result   ="";
        for (int i = 0; i <name.length() ; i++) {
            result +=name.charAt(i);
            if(i!=name.length()-1){
                result +="-";
            }

        }


        return result;
    }
}
