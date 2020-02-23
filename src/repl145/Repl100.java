package repl145;

public class Repl100 {

    public static void main(String[] args)
    {


        System.out.println(alphabetical("adatplqzh")); //"adtz"
        int[][] a = {
                //col    0 1 2 3
                {1,1,1,1}, //row 0
                {1,1,1,1}, //row 1
                {1,1,1,1}  //row 2
        };
        System.out.println(isBorder(a,0,0)); //true
        System.out.println(isBorder(a,1,1)); //false
        System.out.println(isBorder(a,2,1)); //true
        System.out.println(isBorder(a,1,2)); //false
    }
    public static boolean isBorder(int[][] array, int row, int col)
    {
        for(int i=0 ; i<array.length;  i++){
            for(int j=0 ;j<array[i].length; j++){

                if(row==0 ||row== array.length-1  || col==0 || col == array[i].length-1){
                    return true;
                }
            }
        }
        return false;
    }
    public static String alphabetical(String str)	{
        String result=""+str.charAt(0);
        for(int i=0; i<str.length()-1; i++){
            if(result.charAt(result.length()-1)<str.charAt(i+1)){
                result +=""+str.charAt(i+1);
            }


        }
        return result;


    }


}
