package Contest;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {
    public int minOperations(int[] nums) {
        // todo 1 count the  frequency of  the each elelment
        // define the  hash map
        HashMap<Integer , Integer> map  = new HashMap<>() ;
        int n = nums.length ;
        for (int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1) ;
        }
        int c = 0 ;
        for (Map.Entry<Integer , Integer> entry : map.entrySet()){

            int count = entry.getValue() ;
            if (count == 1){
                return  -1 ;
            }
            c += Math.ceil(count /3.0) ;
        }
        return c ;



    }
}
