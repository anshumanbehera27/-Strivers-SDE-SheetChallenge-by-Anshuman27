package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.List;

public class combinactionSUM {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans  = new ArrayList<>();
        ArrayList<Integer> ds  = new ArrayList<>();
        combination(0 , candidates , target ,ds , ans );
        return ans ;


    }
    public static  void  combination(int ind , int[] candidates , int target , ArrayList<Integer> ds , List<List<Integer>> ans ){
        // base case
        if (ind == candidates.length){
            if (target == 0 ){
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        //  we are able to pick the element if   index is less then tagert
        if (candidates[ind] <= target){
            ds.add(candidates[ind]);
            combination(ind , candidates ,target - candidates[ind] ,ds , ans );
            ds.remove(ds.size()-1);

        }
        combination(ind+1 , candidates , target , ds ,ans );

    }
}
