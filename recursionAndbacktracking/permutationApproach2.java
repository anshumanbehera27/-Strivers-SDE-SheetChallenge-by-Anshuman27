package resursionREv.permutation;

import java.util.ArrayList;
import java.util.List;

public class permutationApproach2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        recPermute(0 , nums , ans);
        return ans ;


    }
    public static void recPermute(int ind , int[] nums , List<List<Integer>> ans ){
        if (ind == nums.length){
            // Copy the ds to ans
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);


            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < nums.length ; i++) {
            swap(i , ind , nums);
            recPermute(ind +1 , nums , ans);
            swap(i , ind , nums);


        }
    }
    public static void swap(int i , int  j , int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t ;
    }

    }
