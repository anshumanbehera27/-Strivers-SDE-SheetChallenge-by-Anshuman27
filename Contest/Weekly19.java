package Contest;

import java.util.Arrays;
import java.util.List;

public class Weekly19 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0 ;
        int n = nums.size() ;

        // We have to itrate through the col
        for(int i =0 ; i < n ; i++){
            for(int j =i+1 ; j < n ; j++){

                if(nums.get(i)+ nums.get(j) < target){
                    count++ ;
                }
            }
        }
        return count ;
    }
    // TODO optimized the solution
    public int countPairs1(List<Integer> nums, int target) {
        int count = 0 ;
        int n = nums.size() ;
        Arrays.sort(new List[]{nums});
        int l = 0 ;
        int h = n -1 ;
        while (l < h){
            if (nums.get(l) + nums.get(h) < target){
                count += h - l;
                l++ ;
            }
            else  h-- ;
        }


        return count ;
    }
}
