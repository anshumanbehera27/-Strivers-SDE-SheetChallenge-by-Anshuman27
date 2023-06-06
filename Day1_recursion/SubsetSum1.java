package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum1 {
    public static ArrayList<Integer> subsetSum(int num[]) {

        // creat a array list to store the value of the sets
        ArrayList<Integer> ds = new ArrayList<>();
        // function call
        findtheSubSetSum(0 , 0 , num , num.length,  ds );
        Collections.sort(ds ); // we have to return in increasing order
        return ds ;

    }
    public static void  findtheSubSetSum(int ind , int sum , int [] arr , int n , ArrayList<Integer> ds){
        // base case
        //by choosing we have to pick the element or not pick th element we have to add the sum of value when we reach  the end
        if (ind == n){
            ds.add(sum);
            return;
        }
        // by picking of the element of the paticular index
        // we have to increase the index and add the  value to the sum
        findtheSubSetSum(ind+1 , sum + arr[ind] , arr , n , ds );
        // by not pick of the element
        // we have to just increase the index
        findtheSubSetSum(ind+1 , sum , arr , n , ds );

    }

}
