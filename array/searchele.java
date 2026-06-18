package array;

public class searchele {
    public static int  searchanElement(int arr[], int target){

        for(int i=0; i<arr.length; i++){

            if (target == arr[i]) {
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 5};
        int target = 5;

        int  result = searchanElement(arr, target);
        
        if(result != -1){
            System.out.println("Element found in index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}