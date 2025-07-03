import java.util.Scanner;



public class Non_Repeating_Character {
    public static char nrc(String s){
        s= s.toLowerCase();
        int[] freq= new int[26];
        for(char ch: s.toCharArray()){
            freq[ch- 'a']++;
        }
        for(char ch: s.toCharArray()){
            if(freq[ch- 'a']==1){
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s= sc.nextLine();
        char result= nrc(s);
        if(result != '$'){
            System.out.println("First non-repeating character: " + result);
        }else{
            System.out.println("No non-repeating character found.");
        }

    }
}
