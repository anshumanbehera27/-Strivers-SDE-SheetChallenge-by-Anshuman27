package String;

import java.util.Stack;

public class reverseWordsinString {
    public static void main(String[] args) {
        String ch = "the sky is blue";
        System.out.println( reverseWords(ch)) ;
    }
    public static String reverseWords(String s) {

        char[] str = s.toCharArray() ;
        // first we have to add it to some Ds to reverse the string of word
        int len = s.length() ;
        // We have to itrate it one by one char and when ever i find the space and i can add it to the stack
        Stack<String> st = new Stack<>() ;
        String word = " " ;
        for (int i = 0; i < len ; i++) {
            // remove the trilling space and leading Space
            while (str.length > i && str[i] == ' '){
                i++ ;
            }
            while (str.length > i && str[i] !=  ' '){
                word += str[i] ;
                i++ ;

            }
            st.push(word );
            word = " " ;

        }

        // now we have to reverse all the word expect the end word because  of space
        String ans = "";
        while (!st.isEmpty()) {
            String top = st.pop() ;
            ans = ans + "" + top ;


        }


        return ans.trim()  ;


    }

}
