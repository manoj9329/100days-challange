public class valid_anagram {

    public static boolean isAnagram(String s, String t){
        
        if (s.length() != t.length()) {
            return false; 
        }

        //create frequency array
        int count[] = new int[26];
        
        //count characters
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;

            
            }
            //check all counts become zero
            for(int i=0; i<26; i++){
                if (count[i] !=0) {
                    return false;                 
                }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "manoj";
        String t = "manojmanu";

        System.out.println(isAnagram(s, t));
        
    }
    
}
