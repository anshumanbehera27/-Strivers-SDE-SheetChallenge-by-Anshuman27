package binaryRev;

public class medianOf2SortedArray {

    public static double median(int[] a, int[] b) {
        // Write your code here.
        int m = a.length;
        int n = b.length ;

        // we have to check that binary search is heppen on the samll size array
        if (m > n) return  median(b , a);
        int low = 0 ;
        int high = m ;
       int  medianPosition = ((m+n)/2);
       while (low <= high) {
           int cut1= (low+high)/ 2 ;
           int cut2 = medianPosition - cut1 ;

           int l1 = (cut1 == 0) ? Integer.MIN_VALUE:a[cut1-1];
           int l2 = (cut2 == 0)? Integer.MIN_VALUE:b[cut2 -1];
           int r1 = (cut1 == m) ? Integer.MAX_VALUE:a[cut1];
           int r2 = (cut2 == n) ? Integer.MAX_VALUE:a[cut2];

           if(l1<r2 && l2<= r1){
               if ((m+n)% 2 != 0) return Math.max(l1,l2);

           }
           else return (Math.max(l1 , l2) + Math.min(r1 , r2 ))/2.0;
       }
       return 0.0;
    }
}
