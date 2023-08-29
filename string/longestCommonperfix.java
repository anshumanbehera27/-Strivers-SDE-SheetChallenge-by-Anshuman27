package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class longestCommonperfix {
    public static void main(String[] args) {
      String[] strs = {"flower","flow","flight"};
        System.out.printf(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        // base case
        if (strs.length == 1) return  strs[0] ;
        // First we have to sort the str array
        Arrays.sort(strs);
        // for store the result  have to create a string bulider
        StringBuilder ans = new StringBuilder()  ;
        // find the prefix 1st index with the last index
        int len = strs[0].length() ;
        int c = 0 ;
        while (c < len){
            if (strs[0].charAt(c) == strs[strs.length -1  ].charAt(c)){
                ans.append(strs[0].charAt(c)) ;
            }
            else break;
            c++ ;

        }
        return ans.toString() ;

    }
}
