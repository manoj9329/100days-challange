import java.util.Scanner;

public class rock_paper_scissor {
    public static String rockPaperscesors(String p1, String p2){

        if (p1.equals(p2)) {
            return "Draw";
        }

        if ((p1.equals("rock") && p2.equals("scissor")) || 
        (p1.equals("paper") && p2.endsWith("rock")) ||
        (p1.equals("scissor") && p2.endsWith("paper"))) {
            return "player 1 Won";
            
        } else {
            return "player 2 Won";
            
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 move: ");
        String p1 = sc.next().toLowerCase();

        System.out.print("Enter Player 2 move: ");
        String p2 = sc.next().toLowerCase();

        String result = rockPaperscesors(p1, p2);
        System.out.println(result);

    }
    
}
