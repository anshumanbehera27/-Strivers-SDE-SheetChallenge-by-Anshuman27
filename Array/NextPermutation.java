package Array;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation){
        // size of the array
        int n = permutation.size();
        // find the break Point of the Array list
        int ind = -1 ;  // break point

        for (int i = n-2; i >=0 ; i--) {
            //index i is the break Point
            if (permutation.get(i) < permutation.get(i+1)){
                    ind = i ;
                    break;
            }
        }
        //if break point does not exist
        if (ind == -1 ){
            // reverse the whole array
            Collections.reverse(permutation);
            return permutation ;
        }
        // FInd the next greater elelement and Swap it with arr[ind]
        for (int i = n-1; i >ind ; i--) {
            if (permutation.get(i) >permutation.get(ind)){
                int temp = permutation.get(i);
                permutation.set(i , permutation.get(ind));
                permutation.set(ind , temp);
                break;
            }
        }
        // Reverse The righ half of the array
        ArrayList<Integer> sublist = (ArrayList<Integer>) permutation.subList(ind +1  , n);
        Collections.reverse(sublist);


        return permutation;




    }
}
