package repl145;

public class ExRepl {
    public static int countNegativeOdd(int[][] array)
    {
        int count=0;
        for(int i=0 ;i<array.length; i++){
            for(int j=0 ; j<array[i].length ; j++){
                if (array[i][j]%2==-1 && array[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println(countNegativeOdd(a)); //should print 3

    int[][] a1 = {
            {-5,-2,-3,7},
            {1,-5,-2,2},
            {1,-2,3,-4}
    };
		System.out.println(diffHiLo(a1)); //should print 12
}
    public static int diffHiLo(int[][] array)
    {
        int max =array[0][0];
        int min =array[0][0];
        for(int i =0 ; i<array.length ; i++) {
            for(int j=0 ; j<array[i].length   ; j++){
                if(array[i][j]>max){
                    max = array[i][j];
                }

            }
        }
        for(int i =0 ; i<array.length ; i++) {
            for(int j=0 ; j<array[i].length   ; j++){
                if(array[i][j]<min){
                    min = array[i][j];
                }

            }
        }


        return ( Math.abs(max)	+ Math.abs(min));
    }
}


