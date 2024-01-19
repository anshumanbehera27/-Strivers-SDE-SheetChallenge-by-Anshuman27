package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appOprationtoMaketwoStringequal {
     private  int[][] dp  = new int[501][501] ;
    public int minOperations(String s1, String s2, int x) {
        int n = s1.length() ;
        int[] diffv = new int[n] ;
        for (int i = 0; i < n; i++) {
            // find all the index of chart which has  different element
            if (s1.charAt(i) != s2.charAt(i)){
                diffv[i] = i ;
            }
        }

        // Create a 2D DP for store the two index i and j and store with -1
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i] , -1);

        }
        int m = diffv.length ;
        if (m % 2 != 0){
            return  -1 ;
        }
        int ans = solve(0 , m-1 ,m , diffv , x) ;
        return  ans  ;
    }
    private int solve(int i , int j , int n , int[] v , int x){
        // base case
        // we have to move it in 3 driction
        if (i >= n ||  j < 0 || i > j) return  0 ;
        if (dp[i][j] != -1) return  dp[i][j] ;

        int  front = v[i+1] - v[i] + solve(i+2 , j , n , v , x) ;
        int back = v[j] - v[j-1] + solve(i , j -2 , n , v, x) ;
        int both =  x + solve(i+1 , j -1 , n , v , x) ;

        dp[i][j] = Math.min(front , Math.min(back , both)) ;


        return dp[i][j] ;
    }
}

