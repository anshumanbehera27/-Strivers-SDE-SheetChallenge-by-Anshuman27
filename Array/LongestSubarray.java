package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    // TODO this is for the positive And negative

    public int subarraySum(int[] nums, int k) {
        // Create a HashMap to Store the perviouse sum
        Map<Integer , Integer> map = new HashMap<>() ;
        int maxLen = 0 ;
        int sum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] ;
            if (sum == k ){
                maxLen = Math.max(maxLen , i +1 ) ;
            }
            int rem  = sum - k ;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem) ;
                maxLen = Math.max(maxLen , len);
            }
            if (!map.containsKey(sum))
            map.put(sum ,i ) ;
        }
        return maxLen ;

    }
    // TODO! MORE OPTIMIZED FOR THE  POSITIVE ONE
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

}
