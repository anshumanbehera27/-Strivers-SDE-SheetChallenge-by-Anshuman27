package pwAssiment.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergSort {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1 , 3, nums2 , 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // define an array  where i can store th element
        int[] ans  = new int[m + n ];
        int i = 0 ; // for  nums1
        int j = 0 ; // for nums2
        int k = 0 ;  // for ans array

        while (i < m && j < n ){

            if (nums1[i]  <= nums2[j]){
                ans[k]  = nums1[i];
                i++;
                k++;
            }
            else if (nums1[i] > nums2[j]){
                ans[k] = nums2[j];
                j++;
                k++;

            }
        }
        // what both of the sorted array has not same lenght
        while (i < m){
            ans[k] = nums1[i];
            i++;
            k++ ;
        }
        while (j < n){
            ans[k] = nums2[j];
            j++;
            k++ ;
        }
        System.out.println(Arrays.toString(ans));

    }

}
