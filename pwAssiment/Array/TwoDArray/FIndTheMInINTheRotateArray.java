package pwAssiment.Array.TwoDArray;

public class FIndTheMInINTheRotateArray {
    public int findMin1(int[] nums) {
        int temp = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return 0;



    }
    public int findMin(int[] nums) {
        int lo = 0 ;
        int hi = nums.length -1 ;

        // if the array is sorted
        if (nums[lo] <= nums[hi])
            return nums[lo];

        while (lo < hi){
            int mid = (lo + hi ) /2 ;
            if (nums[mid] > nums[mid +1]) {
                return nums[mid +1 ];
            }
            if (nums[mid -1 ] > nums[mid]) {
                return nums[mid];
            }
            if (nums[lo] <= nums[mid]){
                lo = mid + 1;
            }
            else hi =  mid -1 ;
        }
        return -1 ;
    }

    }




