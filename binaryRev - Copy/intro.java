package binaryRev;

public class intro {
    public static void main(String[] args) {
       int arr[] = {1, 2 ,3, 4 ,5};
       int n =  5 ;
       int k = 4 ;
        System.out.println(binarysearch(arr , 5, 4));

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
