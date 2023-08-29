package string.StringEasyProblem;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class checkTWOStringisEqualornot {
    public static void main(String[] args) {
        String[] word1 = {"ab" , "c"} ;
        String[] word2 = {"a" , "bc"} ;
       System.out.println(arrayStringsAreEqual(word1  , word2)) ;
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // convert the string array to  String
        String str1 = String.join("", word1) ;

        String str2 = String.join("" , word2) ;
        if (str1.equals(str2)) return true ;
        return  false ;



    }
}
