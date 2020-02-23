package repl145;

public class CodingBat {
    public int start1(int[] a, int[] b) {
        int c=0;
        while(a.length!=0 && b.length !=0 ) {
            if (a[0] == 1) {
                c++;
            }
            if (b[0] == 1) {
                c++;
            }
        }
        return c;
    }

}
