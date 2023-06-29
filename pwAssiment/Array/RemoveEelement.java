package pwAssiment.Array;

import java.util.Arrays;

public class RemoveEelement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr , 3));
        //System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0 ;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val ){
                nums[i] = nums[j];
                i++;
            }

        }
        return i ;

    }


    public static int removeElement1(int[] nums, int val) {
        int n  = nums.length ;
        int cnt = 0 ;

        for (int i = 0; i < n; i++) {
            if (nums[i] == val){
               cnt++ ;
               nums[i] = 0 ;
            }
        }
        Arrays.sort(nums);

    return n- cnt ;
    }
}
