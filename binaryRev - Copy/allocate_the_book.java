package binaryRev;

import java.util.ArrayList;
import java.util.Arrays;

public class allocate_the_book {
    public int books(ArrayList<Integer> A, int B) {

        // base case
        if(B > A.size()) return  -1 ;
        // we have to find the min element as low and sum of the array as high so we are able to applyt the binary search

        int low  = A.get(0);
        int high =  0  ;
        // find the sum of the array
        for (int i = 0; i < A.size(); i++) {
            high = high + A.get(i);
            low = Math.min(low , A.get(i));
        }
        int res = -1 ;
        // app the binary search
        while (low <= high){
            int mid = (low + high)/ 2 ;
            if (isPossiable(A, mid , B)){
                res = mid ;
                high = mid -1  ;

            }
            else low = mid +1  ;
        }
        return low;
    }

    private static boolean isPossiable(ArrayList<Integer> A, int pages, int students) {
        int cnt = 0  ;
        int SumAllocated = 0 ;
        for (int i = 0; i < A.size(); i++) {
            if (SumAllocated + A.get(i) >pages){
                cnt ++ ;
                SumAllocated = A.get(i);

                if (SumAllocated > pages) return false;
            }
            else SumAllocated +=A.get(i);
        }
        if (cnt < students) return  true ;
        return false;



    }

}
