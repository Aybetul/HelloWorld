package day39;

public class StudentCreation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name ="Aybetul";
        s1.age=18;
        s1.gender='f';


        Student s2=new Student();
        s2.name ="Metin";
        s2.age=36;
        s2.gender='M';


        System.out.println("s1 name  "+s1.name);
        System.out.println(s2.name + "   "+ s2.age);
        int oldAge= s2.age;
        s2.age=28;
        System.out.println(s2.name+" "+ s2.age+"  "+s2.gender);


    }
}
