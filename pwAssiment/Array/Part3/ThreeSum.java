package pwAssiment.Array.Part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // creat 2d array top store the element
        List<List<Integer>> list  = new ArrayList<>();
        // Sort the array
        Arrays.sort(nums);

        // we have to take the 3 pointer on is i and j and k
        // i is set as constant and we have to use two pointer for the j and k
        for (int i = 0; i <n -2  ; i++) {
            // For avoid the duplicate element
            if (i> 0 && nums[i] == nums[i-1]) continue;

            int j = i +1 ;
            int k  = n-1 ;
            while (j < k ){
                int sum = nums[i] + nums[j] + nums[k];

                // we have check for if it is less then the taget then we have to j++ ;
                if (sum < 0 ){
                    j++;
                }
                else if (sum > 0){
                    k-- ;

                }
                else {
                    ArrayList<Integer> temp  = new ArrayList<>() ;
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k] );
                    list.add(temp);
                    while (j < k && nums[j] == nums[j+1]) j++ ;
                    while (j < k && nums[k] == nums[k-1]) k--  ;
                    j++ ;
                    k-- ;

                }
            }

        }
        return list ;

    }
}
