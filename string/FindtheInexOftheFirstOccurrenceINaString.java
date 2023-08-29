package string;

public class FindtheInexOftheFirstOccurrenceINaString {
    public static void main(String[] args) {
       String haystack = "sadbutsad", needle = "sad";
        int n = strStr(haystack , needle) ;
        System.out.printf(String.valueOf(n));
    }
    public static int strStr(String haystack, String needle) {
        // find the len for the both of the string
        int n = haystack.length() ;
        int m = needle.length() ;
        // if there is no pattern to match then we have to return ZERO  BASE CASE
        if (m == 0) return  0 ;
        /*
        // NOW we Have to find the LPS - longest Prefix and Suffix
        // how to build the LPS ARRAY
        first we have to move pointer i and j when ever i found this element is present we have to enter  the index of it

         */
        // Create a  LPS ARRAY
        int[]lps = new int[m] ;
        // first index is  0
        lps[0] = 0 ;
        int len = 0 ;
        for (int i = 1; i < m; i++) {
            while (len > 0 && needle.charAt(len) != needle.charAt(i) ){
                len = lps[len-1] ;
            }
            if (needle.charAt(len) == needle.charAt(i)){
                len++ ;
            }
            lps[i] = len ;

        }
        len =  0 ;
        // KMP MATCHER
        //  compare the both of the string and pattern which ever is occor first
        for (int i = 0; i < n; i++) {
            while (len >0 && needle.charAt(len) != haystack.charAt(i) ){
                len = lps[len -1 ];
            }
            if (needle.charAt(len) == haystack.charAt(i)){
                len++ ;
            }
            if (len == m) return  i - m + 1 ;

        }
        return -1 ;



        }


    }

