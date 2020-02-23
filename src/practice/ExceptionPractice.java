package practice;

import java.io.FileNotFoundException;

public class ExceptionPractice {
    public static void main(String[] args)throws Exception {
//        try{
//            throw new  NullPointerException(" jhsahd");
//        }catch(NullPointerException e){
//            throw  new FileNotFoundException("in catch ");
//        }finally {
//
//        System.out.println("sout ici");
//            throw new Exception("in final");
//
//        }
String n="Hello";
String m=new String (n);
        System.out.println("Hello"==m);
        float f= 9.0f;
        String[][] arr={{"a","b","c"},{"c","d"}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("b")) {
                    break;
                }
                System.out.println(arr[i][j]);

             //   int[] arr;

            }
       }

            }
            public void M(){
        return ;
            }
        }


