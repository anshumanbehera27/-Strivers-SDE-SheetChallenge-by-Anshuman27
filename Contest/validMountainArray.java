package Contest;

public class validMountainArray {
    public boolean validMountainArray(int[] arr) {

        int len  = arr.length ;
        // base case
        if (len  < 3 ) return  false ;

        // check for the strictly increasing order

        int pivot   =  -1 ;
        for (int i = 1; i < len; i++) {
            int prev = arr[i-1];
            int curr = arr[i]  ;
            // strickly increasing so we
            if (prev == curr) return  false ;

            if (prev > curr){
                pivot  = i-1 ;
                break;
            }
        }
        if (pivot == -1 || pivot == 0) return  false ;
        // chek for the strickly decresing
        for (int i = pivot +1 ; i < len ; i++) {
            int prev = arr[i-1] ;
            int curr = arr[i] ;

            if (curr >=  prev) return  false ;


        }
        return pivot != -1 ;

        }



}
