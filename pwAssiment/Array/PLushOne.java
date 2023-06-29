package pwAssiment.Array;

import java.util.Arrays;
import java.util.Collections;

public class PLushOne {
    public static void main(String[] args) {
        int[] nums = {9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    // this is not working of the 9 case
    public static int[] plusOne1(int[] digits) {
        /* convert to the number */
        int nums = 0 ;
        for (int i = 0; i < digits.length; i++) {
            nums = nums * 10 + digits[i];

        }
        // Add one to  the nums

        nums = nums + 1 ;




        int ans[] = new int[digits.length+1];
        int j = digits.length -1 ;
        while (nums > 0  ){
            int dig = nums % 10 ;
            ans[--j] = dig ;

            nums = nums /10 ;
        }
       ;

    return ans  ;
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // Starting from the least significant digit (i.e., the last element of the array)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can add 1 to it and return the updated array
            if (digits[i] < 9) {
                digits[i]++; // Add 1 to the current digit
                return digits; // Return the updated array
            }
            // If the current digit is 9, we set it to 0 and continue with the next digit
            else {
                digits[i] = 0; // Set the current digit to 0
            }
        }
        // If we reach here, it means all digits were 9, so we need to create a new array with one more element
        int[] result = new int[n + 1]; // Create a new array with length n + 1
        result[0] = 1; // Set the first element to 1, since all other elements are 0 by default
        return result; // Return the new array
    }
}
