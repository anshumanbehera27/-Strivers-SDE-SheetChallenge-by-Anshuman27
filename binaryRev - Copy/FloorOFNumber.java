package binaryRev;

public class FloorOFNumber {
    public static void main(String[] args) {
        long[] arr = {1, 2, 8, 10, 11, 12, 19};
        System.out.println( findFloor(arr, 7, 3));
    }

    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = n-1;
        while (start <= end) {

            int mid = (start + end)/ 2;

            if (arr[mid] == x) return mid;

           else if (arr[mid] > x) end = mid -1 ;
           else start = mid +1 ;


        }
        if (arr[end] < x) return -1;
        return start;

    }
}
