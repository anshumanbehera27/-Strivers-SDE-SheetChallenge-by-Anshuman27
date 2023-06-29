package binaryRev;

public class CountTheNUmberOfOccorance {
    int count(int[] arr, int n, int x) {

        int indx = binarysearch(arr , n , x);
        // if taget elemet is not present
        if (indx == -1 ) return   0 ;

        int count = 1 ;
        int left = indx -1 ;
        while (left >= 0 &&arr[left] == x){
            count++;
            left-- ;
        }

        int right = indx +1 ;
        while (right < n && arr[right] == x){
            count++;
            right++;
        }

        return count;
    }
    static int binarysearch(int arr[], int n, int k) {
        int start = 0 ;
        int end = n -1 ;
        while (start <= end){
            int mid  = start + (end - start) / 2 ;

            if (k == arr[mid]) return  mid ;
            else if (k > arr[mid]) start = mid +1 ;
            else end = mid -1 ;

        }
        return  -1 ;
    }
}
