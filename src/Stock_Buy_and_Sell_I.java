import java.util.Scanner;

public class Stock_Buy_and_Sell_I {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum profit is: " + maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int bestBuy = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxProfit = Math.max(maxProfit, (arr[i] - bestBuy));
            bestBuy = Math.min(bestBuy, arr[i]);
        }
        return maxProfit;



    }
}
