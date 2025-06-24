import java.util.Arrays;
import java.util.Scanner;

public class Kadanes_Algo {
    public static int maximum_sum_of_a_subarray(int[] arr){
        int currSum=0, maxSum= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum< 0){
                currSum =0;
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the "+n+" size Array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(maximum_sum_of_a_subarray(arr));
    }
}
