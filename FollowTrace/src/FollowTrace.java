import java.util.Arrays;

public class FollowTrace {
    public static int getMin(int[] a, int k) {
        int[]b=new int[a.length];
        int c;
        Arrays.fill(b, 0);
        while(true){
            b[k]++;
            if(b[k]==2){
                c=k;
                break;
            }
            k+=a[k];
        }

        return c;
    }

}