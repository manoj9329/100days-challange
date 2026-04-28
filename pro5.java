public class pro5 {

    public static int missingNumbrs(int arr[]){

        int n  = arr.length+1;

        int exp_res = n*(n+1)/2;

        int actual_sum = 0;
        for(int i=0; i<arr.length; i++){
            actual_sum += arr[i];

        }
      return exp_res - actual_sum;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};
        int result = missingNumbrs(arr);
        System.out.println("The missing number is : " + result);
        
    }
}