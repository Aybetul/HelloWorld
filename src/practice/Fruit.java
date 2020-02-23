package practice;

public class Fruit {


    public Fruit() {
        System.out.println("Fruit");
    }
}
    class apple extends Fruit{
     public apple(){
        // super();
         System.out.println("Apple");
     }
     public apple(int num){
         System.out.println("Apple cons with num");
     }

        public static void main(String[] args) {
            apple a = new apple();
            apple a2 = new apple(7);

            float f = (150_10.00 > 15_60.00) ? 10 : 20;
            f = f + 12;
            System.out.println(f);
            try {
                eat();

            } catch (Exception e) {
                System.out.println("what");
            }
        }
        public static void good()throws Exception{
         eat();
        }
      public static void eat(){
        //  System.out.println("eat");
      }


    }





