import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray {
    public static void ReverseArr(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the " +size+ " Array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        ReverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

}
