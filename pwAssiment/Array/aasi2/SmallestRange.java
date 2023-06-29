package pwAssiment.Array.aasi2;

public class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {

        int min = 10001 ;
        int max = -1  ;
        // max - k would give us the minimum max
        // max  + k would give is the maximu min

        // find the max and min of the array

     for (int i   : nums){
         min = Math.min(min , i );
         max = Math.max(max , i);

     }
     int ans  = (max- k) - (min + k);

     return Math.max(0 , ans);

    }

}
