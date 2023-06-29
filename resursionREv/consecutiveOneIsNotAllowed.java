package resursionREv;

public class consecutiveOneIsNotAllowed {
    long countStrings(int n) {
        // code here
        // declered the variable
        // there is 2 possiable outcome
        int zeroend = 1 ;
        int oneend  = 1 ;
        int sum  = zeroend + oneend ;
        // while  n is one the there not possiable of consitiuve one
        if (n == 1 ) return  sum ;

        int i = 2 ;
        while (i <= n ){

             oneend = zeroend  % (1000000007) ;
             zeroend =  sum  % (1000000007);
             sum = (oneend + zeroend) % 1000000007;

        }

        return  sum % 1000000007  ;

    }
// optimazation of the code

    long countStringsdp(int n) {
        // Declare variables
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 2;

        // Iterate over the array and calculate the number of strings for each length
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        // Return the number of strings for the given length
        return dp[n];
    }
}
