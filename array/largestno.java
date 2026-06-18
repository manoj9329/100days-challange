    package array;
    
    public class largestno {
        public static int largNo(int arr[]){

            int largest = arr[0];

        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if (arr[j] > largest) {
                    largest = arr[j];
                    
                }
            }
        }
        return largest;

        }
        public static void main(String[] args) {

            int arr[] = {1,2,3,4,5,100};
            System.out.println(largNo(arr));
            
            
        }
    }