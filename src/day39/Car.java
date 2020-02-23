package day39;

public class Car {

    String name;
    int year;
    char model;
String color;

//it does not need static because it needs object
public void goForward(){
    System.out.println(name+"------>> Going forward");
}

public void ageOfTheCar(){
    int y=2020;
    System.out.println(name +"  "+(y-year)+ "  years old car ");
}
public void changeColor(String newColor){
    if(newColor.equals("Blue")|| newColor.equals("White") ||newColor.equals("Black")){
    color=newColor;
        System.out.println("Color change acceptable to "+ color);
    }else{
        System.out.println("Color change  not acceptable, Sorry! ");
    }
}

}
