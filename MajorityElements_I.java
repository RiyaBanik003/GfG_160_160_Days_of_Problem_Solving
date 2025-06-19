import java.util.Scanner;

public class MajorityElements_I {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter " + n+ " elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Majority element is: " +majorElem(arr));
    }
    public static int majorElem(int[] arr){
        int count=0;
        int el = 0;
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                count= 1;
                el= arr[i];
            } else if(arr[i]== el){
                count++;
            }else{
                count--;
            }
        }
        int count1= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== el){
                count1++;
            } if(count1> (arr.length)/2){
                return el;
            }
        }
        return -1;
    }

}
