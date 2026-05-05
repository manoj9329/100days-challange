public class fake_Binary {

    public static String fake(String str){
        String result = "";

        for(int i=0; i<str.length(); i++){
            char digit = str.charAt(i);

            if (digit < '5') {
                result = result + "0";
                
            } else {
                result += "1";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}