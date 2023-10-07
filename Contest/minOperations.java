package Contest;

import java.util.*;

public class minOperations {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>() ;
        nums.add(3) ;
        nums.add(1) ;
        nums.add(5) ;
        nums.add(4) ;
        nums.add(2) ;

        int k = 2  ;

        System.out.println(minOperations(nums , k));

    }
    public static int minOperations(List<Integer> nums, int k) {
        int total_count  = 0 ;
        Set<Integer> arr = new HashSet<>() ;

        for (int i = nums.size() -1; i >= 0 ; i--) {
            total_count++ ;
            // here the k most be come in this paticular range then we  have to add it
            if (nums.get(i) <= k){
                arr.add(nums.get(i)) ;
            }
            // when ever we get the all of the  element we  have to remove it
            if (arr.size() == k) break;

        }
        return total_count ;

    }

//    public static int minOperations(List<Integer> nums, int k) {
//        int count = 0 ;
//        ArrayList<Integer>  value  = new ArrayList<>() ;
//        // instert all the kth element  in the value
//        for (int i = 1; i <= k  ; i++) {
//            value.add(i)  ;
//        }
//        // now we have to check for the  min opration
//        for (int i = nums.size()-1; i >= 0 ; i--) {
//
//            if (!value.isEmpty()) {
//                if (value.contains(nums.get(i))) {
//                    count++;
//                    value.remove(nums.get(i));
//
//                }
//
//            }
//            else break;
//        }
//        return count ;
//
//    }
}
