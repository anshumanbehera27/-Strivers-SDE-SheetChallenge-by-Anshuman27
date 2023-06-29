package pwAssiment.Array;

public class MOveZero {

    public void moveZeroes(int[] nums) {
        int next = 0 ;
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0 ){
                int temp = nums[next];
                nums[next] = nums[i];
                nums[i] = temp;
                next++;
            }

        }

    }
}
