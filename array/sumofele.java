package array;

public class sumofele {
    public static int sumOfele(int num[]){
        
    int sum = 0;
    for(int i=0; i<num.length;i++){

        sum = sum + num[i];
    }
    return sum;
    }
    public static void main(String[] args) {
        int sum[] = {1, 2, 4, 6, 7};
        System.out.println("Sum of all the element is: " + sumOfele(sum));
        
    }
    
}
