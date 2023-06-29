package pwAssiment.Array.Part3;

import java.util.Arrays;

public class ClosestSum {
    public int threeSumClosest(int[] nums, int target) {
        // len of the Array
        int n = nums.length;
        // sort the Array
        Arrays.sort(nums);
        // we have to took the 3 pointer  p1 p2 and p3
        int min_diff = Integer.MAX_VALUE;
        int closeesSum = 0 ;
        // the outer loop of the p1 pointer
        for (int p1 = 0; p1 < n-2; p1++) {
            int p2 = p1 +1  ;
            int p3 = n-1 ;
            while (p2 < p3){
                int sum  = nums[p1] + nums[p2] + nums[p3];
                if (sum > target)p3-- ;
                else if (sum < target) p2++  ;
                else return  sum ;
                int diff = Math.abs(sum - target);
                if (diff < min_diff){
                    min_diff = diff ;
                    closeesSum = sum ;
                }
            }
        }
        return closeesSum ;

    }
}
