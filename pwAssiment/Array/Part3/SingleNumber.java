package pwAssiment.Array.Part3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        // First Sort the Array
        Arrays.sort(nums);
        int i = 0 ;
        while (i < nums.length){
            // this will cover the edge Case which use if the elelement is present at the last

            if (i == nums.length -1  &&  nums[i] != nums[ i+1 ]){
                return nums[i];
            }
            i = i + 2 ;
        }

        return  -1 ;

    }
}
