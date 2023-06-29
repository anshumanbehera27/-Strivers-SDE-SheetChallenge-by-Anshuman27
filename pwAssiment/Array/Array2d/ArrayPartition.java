package pwAssiment.Array.Array2d;

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int res = 0 ;
        // arrray is of 2n intenger
        // first we have to find all of the  pair
        // if  i itrate my ar with +2 then i am able to find all of my ans
        // first Sort the array
        Arrays.sort(nums);

        int l = 0 ;
        int r = nums.length - 2 ; // -2 because we have to find the pair
        while (l< r ){
            res += nums[r] + nums[l];
            l += 2 ;
            r -= 2 ;


        }
        if (l == r ) res += nums[l];

        return res;
    }
}
