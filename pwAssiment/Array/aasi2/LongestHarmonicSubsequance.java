package pwAssiment.Array.aasi2;

import java.util.HashMap;

public class LongestHarmonicSubsequance {
    public int findLHS(int[] nums) {
        // define a hash map to store the key and  and it s frequency
        int count = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0 )+1);
        }
        // check
        for (int key : map.keySet()){
            if (map.containsKey(key+1)){
                count = Math.max(count , map.get(key) + map.get(key +1 ));

            }
        }
        return count  ;

    }

}
