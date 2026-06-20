package two_pointers;

public class reverseString {
    public static void reverseAstring(char s[]){
        
        int left= 0;
        int right = s.length-1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;


        }

    }



    public static void main(String[] args) {
        char s[] = {'m', 'q'};
        reverseAstring(s);
        
    }
    
}
