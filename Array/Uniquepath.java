package Array;

import java.util.Arrays;

public class Uniquepath {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m+1][n+1] ;
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i] , -1 );
        }


     int num =  numberOfpath(0 , 0 , m , n ,dp );
     if (m == 1 && n == 1) return  num ;
     return dp[0][0] ;


    }
    public int numberOfpath(int i  , int j , int m , int n ){
        // we can only move on right and bottom

        // whenever i and j reach to end point of the matrix then i have to return 1
        if (i == m-1 && j == n-1 ) return  1  ;
        // whenever i or j reach the boudary without reach the destanation we have to return 0
        if (i >= m || j >= n) return  0 ;

        return numberOfpath(i+1 ,j , m ,n ) + numberOfpath(i , j+1 , m , n ) ;
    }
    public int numberOfpath(int i  , int j , int m , int n , int[][] dp ){
        // we can only move on right and bottom

        // whenever i and j reach to end point of the matrix then i have to return 1
        if (i == m-1 && j == n-1 ) return  1  ;
        // whenever i or j reach the boudary without reach the destanation we have to return 0
        if (i >= m || j >= n) return  0 ;
        if (dp[i][j]!= -1 ) return dp[i][j] ;


       else return dp[i][j] =  numberOfpath(i+1 ,j , m ,n, dp ) + numberOfpath(i , j+1 , m , n ,dp) ;
    }
}
