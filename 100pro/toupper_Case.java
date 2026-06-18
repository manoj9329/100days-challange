import java.util.Scanner;

public class toupper_Case {
    public static String toUpppercase(String s){

        return s.toUpperCase();


    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        

        System.out.println(toUpppercase(s));


    }
}
