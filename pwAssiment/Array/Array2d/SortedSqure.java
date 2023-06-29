package pwAssiment.Array.Array2d;

import java.util.Arrays;

public class SortedSqure {
    public int[] sortedSquares(int[] nums) {

        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
