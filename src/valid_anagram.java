import java.util.Scanner;

public class valid_anagram {
    public static boolean anagram(String s1, String s2){
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()== s2.length()){
            int[] counts= new int[26];
            for(int i=0; i<s1.length(); i++){
                counts[s1.charAt(i)- 'a'] ++;
                counts[s2.charAt(i)- 'a'] --;
            }
            for(int count: counts){
                if(count != 0){
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String s1= sc.nextLine();
        System.out.println("Enter the 2nd string: ");
        String s2= sc.nextLine();
        boolean result= anagram(s1, s2);
        if(result){
            System.out.println("Are anagram!");
        }else{
            System.out.println("Not anagram");
        }
    }
}
