package Array;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length ;

        HashMap<Integer ,Integer> map = new HashMap<>() ;
        for (int j = 0; j < n; j++) {
            map.put(nums[j],map.getOrDefault(nums[j] , 0) +1 );
        }
        n = n / 2  ;
       //The entrySet() method in a hash map returns a set of all the entries in the hash map.
        // Each entry in the set is a Map.Entry object, which contains the key and value of the corresponding entry in the hash map.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return -1  ;

    }
}
