import java.util.Arrays;
import java.util.Scanner;

public class GreedyCoins {

    public static int minNumCoins(int coins[], int sum) {
        Arrays.sort(coins);
        int totalCoins=0;
        for(int i=coins.length-1; i>=0; i--){
            totalCoins+=sum/coins[i];
            sum=sum-coins[i]*(sum/coins[i]);
        }
        return totalCoins;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String coinsStringLine = input.nextLine();
        String coinsString[] = coinsStringLine.split(" ");
        int coins[] = new int[coinsString.length];
        for(int i=0;i<coinsString.length;i++) {
            coins[i] = Integer.parseInt(coinsString[i]);
        }

        int sum = input.nextInt();

        System.out.println(minNumCoins(coins, sum));
    }
}