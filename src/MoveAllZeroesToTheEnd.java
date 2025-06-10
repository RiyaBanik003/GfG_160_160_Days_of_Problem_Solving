import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroesToTheEnd {
    public static void moveZeroes(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[count++]= arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]= 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements (must include 0) : ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();

        }
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
