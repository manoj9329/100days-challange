public class removeexclamationmarks {

    public static String removeExclamationmarks(String s){

        return s.replace("!", " ");    }

    public static void main(String[] args) {
        String s = "Hello! World!!";
        
        String result = removeExclamationmarks(s);
        System.out.println(result);
        
    }
}