package Array;


import java.util.*;
public class Maximum_Subarray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


        }
        findthe_maximumSubqrray(arr  , n);
    }

    static void findthe_maximumSubqrray(int[] arr  , int  n){
        int sum = 0 ;
        int maxi = Integer.MIN_VALUE ;
        int start  = 0 ;
        int ansstat = 0 ;
        int end = 0  ;
        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i ;
            sum += arr[i];
            if (sum > maxi){
                maxi = sum ;
                ansstat = start ;
                end = i ;
            }
            if (sum < 0){
                sum = 0 ;
            }
        }

        System.out.println("maximum value is "+ maxi);
        for (int i = ansstat; i <= end ; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
