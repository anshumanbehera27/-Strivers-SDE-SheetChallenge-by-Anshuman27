package string.StringEasyProblem;

import java.util.Arrays;

public class shuffleString {
    public static void main(String[] args) {
        String   s = "codeleet" ;
        int[] indices = {4,5,6,7,0,2,1,3} ;
        System.out.println(restoreString(s, indices));
    }
    public static String restoreString(String s, int[] indices) {

        // convert the String to array
      //  char[] st = s.toCharArray() ;
        // now create another array to store the ans
        char[] ans = new   char[s.length()] ;
        for (int i = 0; i < s.length(); i++) {

            int ind = indices[i] ;
            ans[ind] = s.charAt(i) ;
        }
        //  Convert to Array to String
        String value = new String(ans) ;
        return  value ;
    }
}
