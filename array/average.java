package array;

public class average {
    public static void main(String[] args) {
        
        int n[] = {10, 20, 78, 142};
        int sum = 0;

        for(int i=0; i<n.length; i++){
            sum = sum + n[i];

        }
        System.out.println("The total sum is : "+ sum );
        double result = sum/n.length;
        System.out.println("The Average of the sum is : " + result);
    }
    
}
