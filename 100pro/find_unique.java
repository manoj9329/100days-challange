public class find_unique {

    public static int uniqueElements(int arr[]){
        int result = 0;
        for(int un : arr){
            result =  result ^ un;
        }
        return result;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,1,2,4};
        int unique = uniqueElements(arr);
        System.out.println("Unique Element is : " + unique);
        
    }

    
}
