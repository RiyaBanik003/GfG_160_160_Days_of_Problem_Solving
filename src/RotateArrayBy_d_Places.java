import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayBy_d_Places {
    public static void ReverseArr(int[] arr, int start, int end){
        while(start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
      public static void rotateArr(int[] arr, int d){
        int n= arr.length;
        d= d%n;
        ReverseArr(arr,  0, d-1);
        ReverseArr(arr, d, n-1);
        ReverseArr(arr,0, n-1);
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter d (rotation count): ");
        int d= sc.nextInt();
        rotateArr(arr, d);
        System.out.println("Rotated array: "+ Arrays.toString(arr));
    }



}
