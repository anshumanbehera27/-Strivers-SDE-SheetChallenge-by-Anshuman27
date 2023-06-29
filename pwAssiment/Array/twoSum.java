package pwAssiment.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twoSum {
    public static void main(String[] args) {
        int[] arr  = {2,7,11,152,7,11,15};
        System.out.println(Arrays.toString(twoSum1(arr , 9)));
    }
    static int[] twoSum(int[] arr , int target){
        // len of the array
        int n  = arr.length ;
        // create an ans array
        int[] ans  = {-1 ,-1 };
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n  ; j++) {
                if(i != j&& arr[i] + arr[j] == target){
                    ans[0] = i ;
                    ans[1] = j ;
                    break;
                }
            }
        }
        return ans ;    // TC - 0(n^2)
    }
    // optimzed the code of it
    // With help of the hash map
    static int[] twoSum1(int[] arr , int target){
        int n = arr.length ;
        int[] ans = {-1 , -1 };
        HashMap<Integer , Integer> hm  = new HashMap<>() ;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(target - arr[i])){
                ans[0] = hm.get(target - arr[i]);
                ans[1] = i ;
                break;

            }
            hm.put(arr[i], i);
        }
        return  ans ; // TC - O(N)


    }

}
