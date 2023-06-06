package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetsII {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // for  finding the duplicate easily we have to sort the array
        Arrays.sort(arr);
        // creat a 2nd arraylist to return the  value
        ArrayList<ArrayList<Integer>> ans   = new ArrayList<>();
        // to store the subsets
        ArrayList<Integer> ds = new ArrayList<>();
        findUniqueSubset(0 , arr , ds , ans);
        return ans;


    }
    public static void  findUniqueSubset(int ind , int[] arr , ArrayList<Integer> ds ,ArrayList<ArrayList<Integer>>  ans ){
        // first we add the empty ds
        ans.add(new ArrayList<>(ds) );
        for (int i = ind; i < arr.length; i++) {
            // we will use this to avoid the duplicate element
            if (i != ind &&  arr[i] == arr[i -1 ]) continue;
            // pick of the ele
            ds.add(arr[i]);
            findUniqueSubset(i+1 , arr , ds , ans);
            // not pick the ele
            ds.remove(ds.size() -1);
        }

    }
}
