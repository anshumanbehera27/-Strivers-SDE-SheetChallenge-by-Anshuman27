package string;

import java.util.Stack;

public class removeConsitutiveCharacters {
    public String solve(String A, int B) {
        String ans  = "";

        for (int i = 0; i < A.length(); i++) {
            int j = i +1 ;
            while (j < A.length() && A.charAt(i) == A.charAt(j)){
                j++;
            }
            if (j - i != B){
                ans += A.substring(i , j) ;

            }
            i  = j - 1 ;


        }
        return ans ;



    }

//    public String solve(String A, int B) {
//
//        // create a stack
//        Stack<Character> st  = new Stack<>() ;
//        for (int i = 0; i < A.length(); i++) {
//            char charater = A.charAt(i) ;
//           if (!st.isEmpty() && st.peek() == charater){
//                st.pop() ;
//            }
//           else {
//               st.add(charater) ;
//           }
//        }
//
//        // print int the from of string
//        String ans = "" ;
//        while (!st.isEmpty()){
//            ans += st.pop() ;
//        }
//
//        StringBuilder an = new StringBuilder(ans)  ;
//        an.reverse() ;
//
//        return an.toString();
//
//
//
//
//
//    }
}
