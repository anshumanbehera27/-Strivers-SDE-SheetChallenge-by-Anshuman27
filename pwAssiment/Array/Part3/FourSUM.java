package pwAssiment.Array.Part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSUM {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length ;
        // creat a 2d Array to Store the result
        List<List<Integer>> ans = new ArrayList<>( );
        // Sort the array
        Arrays.sort(nums);
        // we have to take the 4 pointer here
        // two is  stand as constant  and two is make as pointer
        for (int i = 0; i < n   ; i++) {
            // Avoid duplicate
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < n ; j++) {
                // for Avoid the duplicate
                if (j > i+1  && nums[j] == nums[j-1]) continue;
                // two pointer
                int k = j +1 ;
                int l = n -1 ;
                while (k < l ){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target){
                        // creat a temp arraylist to store the  4 posiable elelement
                        ArrayList<Integer> temp =  new ArrayList<>() ;
                        temp.add(nums[i] );
                        temp.add(nums[j] );
                        temp.add(nums[k] );
                        temp.add(nums[l] );
                        ans.add(temp);
                        k++ ;
                        l-- ;
                        // skip the duplicate
                        while (k < l && nums[k] == nums[k-1]) k++ ;
                        while(k < l && nums[l] == nums[l+1]) l-- ;
                    }
                    else if (sum < target) k++ ;
                    else   l -- ;
                }

            }

        }
        return ans ;

    }
}
