import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZigZagSequence {

    static int najdiNajdolgaCikCak(int a[]) {
        if(a.length==1 && (a[0] != 0)){
            return 1;
        }
        int max=1;
        int localMax=1;

        for(int i=1; i<a.length; i++){
            if(a[i-1]>0){
                if(a[i]<0){
                    localMax++;
                }
                else {
                    localMax=1;
                }
            }
            else if(a[i-1]!=0){
                if(a[i]>0){
                    localMax++;
                }
                else {
                    localMax=1;
                }
            }
            if(localMax>max) max=localMax;
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        int i,j,k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a[] = new int[N];
        for (i=0;i<N;i++)
            a[i] = Integer.parseInt(br.readLine());

        int rez = najdiNajdolgaCikCak(a);
        System.out.println(rez);

        br.close();

    }

}
