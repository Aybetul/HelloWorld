package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class A  {
    int num=23;
    A(int c, int b){

    }
    public A(){
        System.out.println("A class");
    }
    public int  a(){
int x=5;
return x++;
    }
    int a;
 //  public abstract void A();

}
class B extends A {
    B(int  n){

    }
    StringBuilder str;
//B(){
//    System.out.println(str);
//
//
//}
}
class C extends B{
    C(int c){
    super(45);
    }
static double area;



    public static void main(String[] args) {
        //  int q=Integer.parseInt(args[0]);
        //  System.out.println(q);
        B b = new B(78);
        // System.out.println(b);
        double m, n, g;
        m = 3;
        n = 8;
        g = 6;
        area = m * n * g;
        A z = new B(78);
        A x = new C(90);
        z = (A) x;

        z = (C) x;

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(null);
        l.remove(null);
        System.out.println(l);

        StringBuilder str = new StringBuilder(5);
        System.out.println(str);
        String str2 = "";
        System.out.println(str.equals(str2));
        System.out.println(str.toString().equals(str2.toString()));
        System.out.println("string ");
        StringBuilder sb = new StringBuilder("ama");
        sb.append("ase");

sb.delete(0,2);
        System.out.println(sb.toString());

//    @Override
//    public void A() {
//
//    }
    }

}