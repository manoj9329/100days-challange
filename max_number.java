public class max_number {

    public static int max_numberinarray(int arr[]){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            } 
        } 
        return max;       
        }

    public static void main(String[] args) {
        
        int arr[] = {12, 45, 7, 89, 23};
        System.out.println("Maximum number in an array is : " + max_numberinarray(arr));




    }
}