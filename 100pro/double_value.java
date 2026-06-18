import java.util.Arrays;

public class double_value {
    public static int[] map(int arr[]){
        for(int i = 0; i <arr.length; i++){
            arr[i] = arr[i] * 2;

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2,4};
        System.out.println(Arrays.toString(map(arr)));

    }
    
}
