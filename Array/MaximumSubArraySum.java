package Array;

public class MaximumSubArraySum {
    int findZeroes(int arr[], int n, int m){
        int left = 0 , right  = 0 ;
        int res = 0  ;
        int count = 0 ;
        while (right < n ){
            if (arr[right] ==  0) count ++ ;
            while (count >= m){
                if (arr[left] == 0) count -- ;
                left++;
            }
            res = Math.max(res , right -left + 1);
            right++;


        }
        return res;
    }
}
