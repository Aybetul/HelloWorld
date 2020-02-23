package day39;

public class CarCreation {
    public static void main(String[] args) {

        Car c1= new Car();
        Car c2= new Car();
        c1.name= "Nissan";
        c1.year=2016;
        c1.model='S';
        c1.color="White";

        System.out.println(c1.name+" "+ c1.model+" "+ c1.year   );
        c2.name="BMW";
        c2.year=2019;
        c2.model='X';
        c2.color="Black";
        
        // change the c2 color
        c2.color=c1.color;
        System.out.println("c2.color = " + c2.color);
        System.out.println("c2.name = " + c2.name);
        System.out.println("c2.model = " + c2.model);
        System.out.println("c2.year = " + c2.year);


        c1.goForward();
         c2.goForward();
c1.ageOfTheCar();
c1.changeColor("Blue");
c1.changeColor("Red");
    }


}
