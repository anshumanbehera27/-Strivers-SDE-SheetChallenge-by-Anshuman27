package LinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        // First Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // reomove duplicate
            if (i != 0 && nums[i] == nums[i-1]) continue;

            // fixed the one pointer and move both of the pointer
            int j = i + 1 ;
            int k = nums.length - 1;
            while (j < k){
                int sum = nums[i]+ nums[j]+nums[k];
                if (sum  < 0)  {
                    j++;
                } else if (sum > 0) {
                    k--;

                }
                else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j] , nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    // skip the dupilicate
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k-1]) k--;


                }
            }

        }
        return ans;

    }
}
