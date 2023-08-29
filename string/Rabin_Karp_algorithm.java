package string;

public class Rabin_Karp_algorithm {
    static void rabinKarpAlgo(String pattern, String text, int q) {
        int m = pattern.length() ;
        int n = text.length() ;
        int i , j ,hash_p = 0 , hash_t = 0 , h =1 , d = m+ n ;

        // FIND the hash function of the pattern
        for (i = 0; i < m-1 ; i++) {
            h = (h * d) % q ;

        }
        // calulate the hash value for the pattren and test
        for ( i = 0; i < m ; i++) {
            hash_p = (pattern.charAt(i) + d* hash_p) % q ;
            hash_t = (text.charAt(i) + d * hash_t) % q ;


        }
        // FIND the match
        for ( i = 0; i <= n-m; i++) {
            // check the hash value is same or not
            if (hash_p == hash_t) {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) break;

                }

                // if pattern math
                if (j == m) System.out.println("we found the pattren " + i);
            }
        }

    }
}
