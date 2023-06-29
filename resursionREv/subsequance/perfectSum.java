package resursionREv.subsequance;

public class perfectSum {
    public static int perfectSum(int arr[], int n, int sum) {

        // create a table to store the results of all possible subsequences
        int[][] dp = new int[n + 1][sum + 1];

        // initialize the table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (arr[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]) ;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // return the number of subsequences with sum equal to `sum`
        return dp[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 8, 10};
        int n = arr.length;
        int sum = 10;

        System.out.println(perfectSum(arr, n, sum));
    }

}
