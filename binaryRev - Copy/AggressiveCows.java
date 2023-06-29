package binaryRev;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length ;
        Arrays.sort(stalls);
        int maxD = stalls[n-1] - stalls[0];
        int ans = Integer.MIN_VALUE;

        for (int d = 1; d <= maxD; d++) {
            boolean possiable = isCompatiable(stalls  , d , k );
            {
                if (possiable){
                    ans = Math.max(ans , d);
                }
            }

        }
        return ans;


    }
    static  boolean isCompatiable(int stall[] , int dist , int cows ){
        int n  = stall.length ;
        int  k = stall[0];

        cows-- ;
        for (int i = 0; i < n; i++) {
            if (stall[i] - k >= dist){
                cows-- ;
                if (cows == 0 ) return  true ;

            }
            k = stall[i];

        }
        return false ;
    }
}
