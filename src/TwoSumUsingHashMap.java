import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumUsingHashMap {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement= target- nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n= sc.nextInt();
        int[] nums= new int[n];
        System.out.println("Enter "+ n+ " elements: ");
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target= sc.nextInt();
        int[] result= twoSum(nums, target);
        System.out.println("Indices: "+ Arrays.toString(result));
    }
}
