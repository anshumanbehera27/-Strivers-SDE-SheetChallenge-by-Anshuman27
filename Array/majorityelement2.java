package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityelement2 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length ;

        HashMap<Integer , Integer> map = new HashMap<>() ;
        // now we have to add all the possibale occrance in the hashmap
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i] , 0) +1 ) ;

        }
        // now we have to check the paticular element and we have to return in the from of list
        List<Integer> ans = new ArrayList<>( );
        for (int k : map.keySet()) {
            if (map.get(k) >  n / 3 ){
                ans.add(k) ;
            }

        }
        return ans ;

    }
}
