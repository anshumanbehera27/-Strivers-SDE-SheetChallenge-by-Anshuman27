package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public List<List<Integer>> subsets(int[] nums) {
        // make a  2d array list
        List<List<Integer>> res = new ArrayList<>() ;
        ArrayList<Integer> lst = new ArrayList<>();
        subsequence(0 , nums ,lst , res );

        return res;

    }
    public static void subsequence(int ind  , int[] nums , ArrayList<Integer> lst , List<List<Integer>> res  )
    {
        // if all the possiable out come is already in the lst then we have to just return
        if (lst.contains(res)) return;
        // base case
        if (ind == nums.length){
            res.add(new ArrayList<>(lst) );
            return;
        }
        lst.add(nums[ind]);
        subsequence(ind+1  , nums , lst , res);
        lst.remove(lst.size()-1);
        subsequence(ind+1 , nums  , lst , res );




    }
}
