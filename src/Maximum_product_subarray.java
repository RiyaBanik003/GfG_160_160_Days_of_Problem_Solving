import java.util.Scanner;

public class Maximum_product_subarray {
    public static int MaxPdtSubarr(int[] arr){
        int n= arr.length;
        int leftPdt= 1;
        int rightPdt= 1;
        int ans= arr[0];
        for(int i=0; i<n; i++){
            leftPdt = leftPdt == 0 ? 1 : leftPdt;
            rightPdt= rightPdt == 0? 1 : rightPdt;
            leftPdt *= arr[i];
            rightPdt *= arr[n-1-i];
            ans= Math.max(ans, Math.max(leftPdt, rightPdt));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the "+n+" sized Array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The maximum product is: "+MaxPdtSubarr(arr));
    }
}
