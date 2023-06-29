package pwAssiment.Array.aasi2;

import java.util.Arrays;

public class MaxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod  =  1;
        int len = nums.length -1 ;

        for (int i = len; i >len - 3  ; i--) {
            prod *= nums[i];
        }
        for (int i = 0; i < 3; i++) {

        }

        return prod;

    }

    public int maximumProduct1(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length ;
            /*
            "case1" represents the product of the two smallest numbers (nums[0] and nums[1]) in the sorted array,
            multiplied by the largest number (nums[nums.length-1]). You may think why do I use the first two number
            if there are negative numbers and if I multiply two negative numbers then the resultant will be positive.
             */
            int case1  = nums[0] *nums[1] * nums[nums.length -1 ]; // in the case of negative

            int case2  = nums[len -1] * nums[len-2] *nums[len-3];

            int maxi  = Math.max(case1 , case2);

            return maxi ;
        }
    }

