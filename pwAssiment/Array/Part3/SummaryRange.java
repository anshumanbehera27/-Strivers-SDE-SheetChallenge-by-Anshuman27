package pwAssiment.Array.Part3;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length ;
        if (n == 0) return  ans ;

        int FirstEle  = nums[0];
        for (int i = 0; i < n; i++) {
            if (i == n-1 || nums[i] +1  != nums[i+1]){
                if (nums[i] != FirstEle){
                    ans.add(FirstEle + "->"  + nums[i]);
                }
                else ans.add(FirstEle + "") ;
                if (i != n-1) FirstEle = nums[i+1] ;
            }
        }
        return ans ;

    }
}
