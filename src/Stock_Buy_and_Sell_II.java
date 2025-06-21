import java.util.Scanner;

public class Stock_Buy_and_Sell_II {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Maximum profit is: " + maxProfit(arr));
    }
    public static int maxProfit(int[] arr){
        int maxProfit=0, n= arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                maxProfit += arr[i]- arr[i-1];
            }
        }
        return maxProfit;
    }
}
