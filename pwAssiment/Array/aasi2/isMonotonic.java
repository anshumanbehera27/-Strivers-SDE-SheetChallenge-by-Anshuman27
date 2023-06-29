package pwAssiment.Array.aasi2;

public class isMonotonic {
    public boolean isMonotonic(int[] nums) {
        return isincrease(nums) || isdecrese(nums);


    }
    boolean isincrease(int[] nums){
        for (int i = 0; i < nums.length -1 ; i++) {
            if (nums[i] > nums[i+1]) return  false ;

        }
        return true ;
    }
    boolean isdecrese(int[] nums){
        for (int i = 0; i < nums.length -1 ; i++) {
            if (nums[i] < nums[i+1]) return  false ;

        }
        return true ;

    }
}
