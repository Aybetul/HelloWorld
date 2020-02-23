package repl145;

public class exRepl96 {
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        System.out.println(sumEvenIndex(a)); //should print -6
    }
    public static int sumEvenIndex(int[][] array)
    {int sum=0;
        for(int i=0 ; i<array.length; i++){
            if(i%2==0){
                for(int j=0; j<array[i].length; j++) {
                    sum += array[i][j];
                }
                }else if (i%2==1){
                    for(int j=0; j<array[j].length-2 ; j +=2) {
                        sum +=array[i][j];
                    }
                }
            }

        return sum;

    }
}
