package pwAssiment.Array;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int  low  = 0 ;
        int hi = nums.length ;

        while (low < hi){
            int mid = (low + hi) / 2;
            if (nums[mid] == target) return  mid ;

            else if (nums[mid] > target){
                low = mid + 1;
            }
            else hi = mid -1;
        }
        return -1 ;

    }
}
