package resursionREv;

public class count_GOOD_number {

    public static void main(String[] args) {
        System.out.println();
    }
    public long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        // find the total number of even in the digt
        long even = (n+1)/ 2 ;
        long odd = n / 2 ;

        // now we know that for every even index we have only 5 possibility  ony even

        // now we know that for eve odd dig we have only 4 possiblity because of prime

        return  (int) (myPow(5 , even) * myPow(4 , odd) %MOD);



    }






    public static long myPow(long x , long n ){
        if (n < 0 ) return  myPowx(1/ x , (int) n);
        return myPowx(x , (int)n );
    }

    public static  long myPowx(long x , int n ){
        // base case
        if (n == 0 ) return  1 ;
        // if the n is
        long temp = myPowx(x , n/2);
        temp = temp * temp;
        if (n % 2 == 0){
            return  temp ;

        }
        // if it is odd
        else return  temp * x ;
        // this will cause the stack overflow error so we can  solve by creat a new finction for it


    }
}
