package string;

public class kmpAlgo {
    // TODO KMP Algorithm

    static  void kmp(String str , String patten){
        int n = str.length() ;
        int m = patten.length() ;
        // TODO create a lps array to store the perfix and suffix of the array so we can check the perviouse ele is match

        int lps[] = new int[m] ;
        filllps(patten) ;
        int i  = 0 ;
        int j = 0 ;
        while (i < n){
            if (str.charAt(i) == patten.charAt(j)){
                i++ ;
                j ++ ;
                if (j == m){
                    System.out.printf(String.valueOf(n-m));
                    j = lps[j-1] ;
                }
            }
            else if (i < n && str.charAt(i) != patten.charAt(j)){
                if (j == 0 ) i ++ ;
                else  j = lps[j-1] ;
            }
        }


    }

    private static int[] filllps(String str) {
        int n = str.length() ;
        int[] lps = new  int[n] ;
        int len = 0 ;
        int i =  1 ;
        lps[0] = 0 ;
        while (i < n){
            if (str.charAt(len) == str.charAt(i)){
                len++ ;
                lps[i] = len ;
                i++ ;
            }
            else {
                if (len == 0 ){
                    lps[i] = 0 ;
                    i++ ;
                }
                else  len = lps[len - i] ;
            }
        }
        return lps ;
    }
}

