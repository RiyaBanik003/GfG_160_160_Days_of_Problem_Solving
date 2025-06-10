import java.util.Scanner;
public class SecondLargestElement {
    public static int SecondLargest(int[] arr){
        int max1= -1;
        int max2= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max1){
                max2= max1;
                max1= arr[i];
            }else if(arr[i]> max2 && max2 != max1){
                max2= arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the" + size + "elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int result = SecondLargest(arr);
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + result);
        }
    }
}
