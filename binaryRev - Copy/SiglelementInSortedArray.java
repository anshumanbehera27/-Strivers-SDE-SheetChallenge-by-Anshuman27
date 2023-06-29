package binaryRev;

import java.util.ArrayList;
import java.util.Arrays;

public class SiglelementInSortedArray {
    public static int findSingleElement(int nums[]) {
        int n = nums.length;
        int elem = 0;
        for (int i = 0; i < n; i++) {
            elem = elem ^ nums[i];
        }

        return elem;
    }
    public static int singleNonDuplicate(ArrayList < Integer > arr) {
        int n = arr.size();
        int low = 0, high = n - 1, mid;

        // Do binary search
        while (low < high) {
            // Calculate mid
            mid = (low + high) / 2;
            // Update low and high.
            if (mid % 2 == 1) {
                int a = arr.get(mid);
                int b = arr.get(mid - 1);
                if (a == b) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
            else if (mid % 2 == 0) {

                int a = arr.get(mid);
                int b = arr.get(mid + 1);

                if (a == b) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
        }

        return arr.get(low);
    }
//    public static int singleNonDuplicate(ArrayList<Integer> arr)
//    {
//        int low = 0 ;
//        int high = arr.size() -1 ;
//        // we have to start from the 2nd last index
//        //  because  for the test case when we have the single element at the last
//        while (low < high){
//            int mid = (low + high) / 2 ;
//            if (mid % 2 == 0){
//                // Cheking Weather We are in right half
//                if (arr.get(mid) != arr.get(mid +1)){
//                    high = mid;
//                }
//                // checking the left half
//                else low = mid +1 ;
//
//            }
//            else {
//                // check whether we are in the right half
//                if (arr.get(mid) == arr.get(mid +1)){
//                  low = mid +1 ;
//
//                }
//                // move to the left
//                else high = mid;
//            }
//        }
//        return arr.get(low);
//
//
//    }

}
