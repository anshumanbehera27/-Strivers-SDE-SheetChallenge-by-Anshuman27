package Array;

import java.util.Arrays;

public class longestConsecutiveSequance {
    public int longestConsecutive(int[] nums) {
        // we have to take the help of the 3 variable
        if (nums.length == 0) return  0  ;
        int lastSum = Integer.MIN_VALUE ;
        int cnt = 0 ;
        int longest_len = 1 ;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // check that it is consecutive or not
            if (nums[i] - 1 == lastSum){
                // increse the cnt and update the current element
                cnt += 1 ;
                lastSum = nums[i] ;
            }
            else if (nums[i] !=  lastSum){
                cnt = 1 ;
                lastSum = nums[i] ;
            }
            longest_len = Math.max(longest_len , cnt) ;

        }
        return longest_len ;

    }
}
