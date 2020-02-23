package repl145;

import java.util.Scanner;

public class passwordChange {
    public static void main(String[] args) {
    /*  "The password must be:
            //    -at least eight characters long
      //  -contain an uppercase letter
               // -contain a special character
                -not contain the username
                -not be the same as the old password"
        Then, use Scanner to prompt user to input the following:
        Enter your username:
        Enter your old password:
        Enter your new password:
        Validate the complexity of the new password by assuring it meets above requirements.
        If it meets all requirements, print "Password changed successfully!",
        if not print "Invalid password! Try again!" and
        prompt the user to enter above information again
        and this process should automatically repeat until user enters a valid password. */
    passwordValidator();
    }
    public static void passwordValidator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello User your Password has been expired, Please enter new pass word ");
        System.out.println("The password must be: \n" +
                "             -at least eight characters long\n" +
                "              -contain an uppercase letter\n" +
                "              -contain a special character\n" +
                "              -not contain the username\n" +
                "              -not be the same as the old password");
        System.out.println("Enter your username:");
        String userName = scan.next();
        System.out.println("Enter your old password:");
        String oldPass = scan.next();
        System.out.println("Enter your new password:");
        String newPass = scan.next();

        int countOfSpecial=0;
        int countOfUpperL=0;
        for (int i = 0; i < newPass.length(); i++) {
            if (Character.isUpperCase(newPass.charAt(i))) {
                countOfUpperL++;
            }
            if (!Character.isLetterOrDigit(newPass.charAt(i))) {
                countOfSpecial++;
            }
        }
        if( newPass.length()==8   &&  countOfSpecial ==1 && countOfUpperL==1
                && !oldPass.equals(newPass)   && !newPass.contains(userName) ){

        System.out.println("Password changed successfully!");
                    }else {
        System.out.println("Invalid password! Try again!");
passwordValidator();
    }





            }
        }


