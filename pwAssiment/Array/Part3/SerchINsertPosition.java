package pwAssiment.Array.Part3;

public class SerchINsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans  =  n;
        int start = 0;
        int end = n-1;
        while (start <= end) {

            int mid = (start + end)/ 2;

            if (nums[mid] == target) return mid;

            else if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else start = mid +1 ;


        }

        return ans;

    }
}
