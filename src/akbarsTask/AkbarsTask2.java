package akbarsTask;

import java.util.ArrayList;

public class AkbarsTask2 {
    public static void main(String[] args) {
        ArrayList<String> grades = new ArrayList<>();
        grades.add("79");
        grades.add("54");
        grades.add("100");
        grades.add("65");
        grades.add("44");
        grades.add("89");
        grades.add("95");

checkGrades(grades);
countOfMoreThan90(grades);
averageOfGrades(grades);
addGradeLetters(grades);
    }

    /*  Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
              * print pass if its more than 60 fail if not
  * count how many score are more than 90
              * get the average score
  * update the values with score-grade pair
    for example
  79C , 54F, 100A, 65D, 44F , 89B , 95A
      Optionally create 4 methods according to above criteria*/
    public static void checkGrades(ArrayList<String> grades) {
        for (String each : grades)
            if (Integer.parseInt(each) > 60) {
                System.out.println(each+"  Congratulation, Pass!! ");
            } else {
                System.out.println(each+"  Fail!!,Please study more");
            }

    }

    public static void countOfMoreThan90(ArrayList<String> grades) {
        int count = 0;
        for (String each : grades) {
            if (Integer.parseInt(each) > 90) {
                count++;
            }
        }
        System.out.println("Count of grades more than 90 =  "+count);
    }

    public static void averageOfGrades(ArrayList<String> grades) {
        int sum = 0;
        for (String grade : grades) {
            sum += Integer.parseInt(grade);
        }
        System.out.println("Average of the grades is "+sum / grades.size());
    }

    public static void addGradeLetters(ArrayList<String> grades) {
        for (int i = 0; i <grades.size() ; i++) {

            if (Integer.parseInt(grades.get(i)) <= 60 ) {
                String s= grades.get(i)+"F";
              grades.set(i,s) ;
            }
         else   if (Integer.parseInt(grades.get(i)) > 60  && Integer.parseInt(grades.get(i))<70 ) {
                String s= grades.get(i)+"D";
                grades.set(i,s) ;
            }
          else  if (Integer.parseInt(grades.get(i)) >=70 && Integer.parseInt(grades.get(i))<85 ) {
                String s= grades.get(i)+"C";
                grades.set(i,s) ;
            }
         else   if (Integer.parseInt(grades.get(i)) >=85 && Integer.parseInt(grades.get(i))<95 ) {
                String s= grades.get(i)+"B";
                grades.set(i,s) ;
            }

          else  if (Integer.parseInt(grades.get(i)) >=95  ) {
                String s= grades.get(i)+"A";
                grades.set(i,s) ;
            }

        }
        System.out.println(grades);
    }
}