import java.util.*;

public class MajorityElements_II {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n= sc.nextInt();
        System.out.println("Enter the "+n+" length Array elements: ");
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
           list.add(sc.nextInt());
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println("Majority elements are: "+ MajorityElem(arr));

    }
    public static List<Integer> MajorityElem(int[] arr){
        int count1=0;
        int count2=0;
        int n= arr.length;
        int candidate1= Integer.MIN_VALUE;
        int candidate2= Integer.MIN_VALUE;
        List<Integer> ans= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]== candidate1){
                count1++;
            }else if(arr[i]== candidate2){
                count2++;
            }else if(count1==0){
                candidate1= arr[i];
                count1=1;
            } else if (count2==0) {
                candidate2= arr[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0; i<n; i++){
            if(candidate1 == arr[i]) count1++;
            if(candidate2== arr[i]) count2++;

        }
        if(count1> n/3) ans.add(candidate1);
        if (count2> n/3) ans.add(candidate2);
        Collections.sort(ans);
        return ans;
    }
}
