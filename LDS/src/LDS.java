import java.util.Scanner;


public class LDS {
    private static int najdolgaOpagackaSekvenca(int[] a) {
        int max=0, localMax=0;
        for(int i=0; i<a.length; i++){
            localMax=1;
            for(int j=1; j<a.length;j++){
                if(a[j]==a[j-1]){
                    continue;
                }
                else if(a[i]>a[j] && a[j]!=a[j-1]){
                    localMax++;
                }
            }
            if(localMax>max){
                max=localMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = stdin.nextInt();
        }
        System.out.println(najdolgaOpagackaSekvenca(a));
    }


}
