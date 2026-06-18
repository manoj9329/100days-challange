import java.util.Scanner;

public class carrent_cost {
    public static int carCost(int d){


        int total = d *40;
        if (d >= 7) {
            total -= 50;
        } else  if (d >= 3) {
            total -= 20;
            
        }
        return total;
        
    
    
    
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int cost = carCost(days);
        System.out.println("Total cost: $" + cost);
    }
}
