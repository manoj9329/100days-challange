package set;

import java.util.HashSet;
import java.util.Set;

public class removeduplicates {

    public  int[] removeDup(int num[]){

        Set<Integer> s= new HashSet<>();

        for(int n : num){

            s.add(n);
        }
        return s;

    }

    public static void main(String[] args) {
        
    }
    
}
