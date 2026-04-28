public class pro3 {
    public static int linearSearch(int arr[], int target){

        for(int i=0; i<arr.length; i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {15, 5, 20, 35, 2, 42, 67, 17};
        int target = 42;
        int res = linearSearch(arr, target);
        if (res != -1) {
            System.out.println("The element found in index : "  + res);
        } else {
            System.out.println("Element not found");

        }
        
    }
}