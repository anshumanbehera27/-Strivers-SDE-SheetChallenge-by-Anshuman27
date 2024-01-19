package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class makeaStringSubsequance {
    public boolean canMakeSubsequence(String str1, String str2) {
        // Find the length of the Two String


        int str1len = str1.length() ;
        int str2len = str2.length() ;
        // we have to make a two pointer left and right
        int left =  0 ;
        int right  = 0 ;

        // Iterate over the characters in str2.

        while (left < str1len && right < str2len){
            //If the current characters are equal, or if str1[left] + 1 is equal to str2[right],
            // then advance both indices.
            if (str1.charAt(left) == str2.charAt(right) || str1.charAt(left)+1 == str2.charAt(right)){
                left++ ;
                right++ ;
            }
            // for the special test case if the indices is Z or A then we have to move  Both of the indices
            else if (str1.charAt(left) == 'z' && str2.charAt(right) == 'a') {
                left++ ;
                right++ ;
            }
            // else only increment the left one
            else left++ ;

        }
        return right == str2len ;
    }

//   public boolean canMakeSubsequence1(String str1, String str2) {
//
//        /*what are  testcase
//        1 we have to check whose string is match or not whose on is not matching  store the indices
//        2  - now creat a  Function which is help us to increment the  String value one by one
//        3 - we have to check the condation that if str2 contains Str1 then  we have to  return true
//        else fase
//         */
//        ArrayList<Integer> arr = new ArrayList<>();
//        int i = 0 ;
//        int j = 0 ;
//        while (i < str1.length() && j < str2.length()){
//            if (str1.charAt(i) == str2.charAt(i)){
//                i++;
//                j++;
//            }
//            else {
//                arr.add(i ) ;
//                i++ ;
//
//
//            }
//
//        }
//
//
//
//
//    }
}
