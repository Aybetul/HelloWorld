package day39;

public class exPractice {
    public static void main(String[] args) {
        String sen = "HelloFriends!It'sNiceOutThereToday!";
        System.out.println( strWithSpace(sen) );
    }

    public static String strWithSpace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result += " " + str.charAt(i);
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }
}
