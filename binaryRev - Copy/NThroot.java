package binaryRev;

public class NThroot {
    static  double mutiply(double mid , int n ){
        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans* mid;
        }
        return  ans ;
    }
    public static int NthRoot(int n, int m) {
        double lo = 1;
        double hi = m ;
        double eps = 1e-7;

        while ((hi - lo ) > eps){
            double mid = (hi + lo) / 2.0 ;

            if (mutiply(mid , n ) < m ){
                lo = mid;
            }
            else  hi = mid ;

        }
        return (int) Math.round(lo);


    }
}
