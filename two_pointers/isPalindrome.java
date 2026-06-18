package two_pointers;

public class isPalindrome {
    public static boolean validPalindrome(String s){

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if (s.charAt(left) != s.charAt(right)) {
                return false;

            }
            
                left ++;
                right--; 
            
        }
        return true;


    }
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(validPalindrome(s));
        
    }
    
}
