package string.StringEasyProblem;

import java.util.Arrays;

public class SortTheSentence {
    public static void main(String[] args) {
      String   s = "is2 sentence4 This1 a3";
        System.out.println( sortSentence(s));
    }
    public static String sortSentence(String s) {
        int len = s.length() ;



        // Split the sentence to the array
        String[] arr =  s.split(" ") ;
        // CREAT a ans array to Store the elelemt
        String[] ans = new String[arr.length+1] ;

        for (int i = 0; i < arr.length; i++) {
            String  si = arr[i] ;
            // First we have to find the Index of
            int index = Integer.parseInt(si.substring(si.length() -1 ));
            // we have to find the orginal string
            String val = si.substring(0 ,si.length() -1) ;
            ans[index] = val ;
        }

        StringBuilder st = new StringBuilder() ;

        for (int i = 1; i <ans.length ; i++) {
            if (i != ans.length -1) st.append(ans[i] + " ") ;
            else  st.append(ans[i]) ;

        }
        return  st.toString() ;
    }
    }

