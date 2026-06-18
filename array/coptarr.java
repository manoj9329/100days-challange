package array;

import set.removeduplicates;

public class coptarr {

    public static int copyAnarray(int arr[]){

        int copy[] = new int[arr.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
        }
    public static void main(String[] args) {
        
    }
    
}
