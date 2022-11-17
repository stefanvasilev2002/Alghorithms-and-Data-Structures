import java.util.Scanner;

import static java.lang.Math.sqrt;

public class MinDistance {

    public static float minimalDistance(float points[][]) {
        double minDistance=sqrt((points[1][1] - points[0][1]) * (points[1][1] - points[0][1]) +
                               (points[1][0] - points[0][0]) * (points[1][0] - points[0][0]));
        for(int i=0; i<points.length; i++){
            for(int j=0; j<points.length; j++){
                double min=sqrt((points[i][1] - points[j][1]) * (points[i][1] - points[j][1]) +
                        (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]));
                if(minDistance>min && min!=0){
                    minDistance=min;
                }
            }
        }
        return (float) minDistance;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        float points[][] = new float[N][2];

        for(int i=0;i<N;i++) {
            points[i][0] = input.nextFloat();
            points[i][1] = input.nextFloat();
        }

        System.out.printf("%.2f\n", minimalDistance(points));
    }
}