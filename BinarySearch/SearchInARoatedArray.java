package binaryRev;

public class SearchInARoatedArray {
    public static int search(int arr[], int key) {
        int low = 0 ;
        int high = arr.length  -1 ;

        while (low <= high){
            int mid = low + (high - low)/ 2 ;

            if (arr[mid] == key) return  mid ;

            // check that left half is sorted or not
            else if  ( arr[mid] >= arr[low]){
                // we have to check that the target is paresent in side  left side
                if ( arr[low] <= key &&  key <= arr[mid]){
                     // so we  have to serach on the left half only
                    high = mid -1 ;
                }
                // then it is presne in the right half
                else  low = mid +1 ;
            }
            //  then  right half is sorted
            else {
                // check the key is present in the  right half or not
                if (key >= arr[mid] && arr[high] >= key){
                    low  = mid +1 ;
                }
                else high = mid -1 ;
            }
        }
        return -1 ;
    }
}
