package practice;

import org.w3c.dom.ls.LSOutput;

public  class A {
    public A(){

    }
    protected final int size=2;
  //  protected boolean n;
    public A(String name){
        super();

    }
    protected  static int m;
    private int n=3;
    public int getN() {
        return this.n;
    }
public Integer Play(){

   return null;

    }
}



class B extends A implements Practice {
    public B(){
        super();
    }
    final  int size=3;
    public B(String name) {
        super(name);
    }

    public void getInfo(){
       System.out.println(super.getN());
   }

    public static void main(String[] args) {
        B ob;
    }

    @Override
    public void A() {
super.m=4;
    }

    @Override
    public void C() {

    }
}