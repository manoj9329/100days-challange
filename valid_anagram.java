import java.util.Scanner;

public class valid_anagram {

    public static boolean isPalindrome(int x){

        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed*10 + digit;
            x = x / 10;
       
    }
        return reversed == original;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
        
    }
}