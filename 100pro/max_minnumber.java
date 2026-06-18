//given an array[1,4,6,8,3]
//find difference between smallest and largest number
//output : 7

public class max_minnumber {
    public static int diffbetweenSmallestandlargest(int arr[]){


        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];

            } else if (arr[i] < min) {
                min = arr[i];
                
            }
            

        }
        return max - min;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 8, 3};
        System.out.println("The difference between is :");
        System.out.println(diffbetweenSmallestandlargest(arr));
        
    }
}