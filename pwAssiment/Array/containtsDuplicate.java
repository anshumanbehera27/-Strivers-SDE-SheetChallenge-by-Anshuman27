package pwAssiment.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class containtsDuplicate {

    // it will show time limit exed
    public boolean containsDuplicate1(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>() ;

        for (int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i])) return  true ;

            else  arr.add(nums[i] );

        }
        return false ;

    }
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) return  true ;

        }
        return false ;

    }

}
