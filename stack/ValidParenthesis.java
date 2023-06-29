package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String expression) {
       // Write your code here.
        // creat a stack to store the all of the elelemtn
        Stack<Character> st = new Stack<>();

        for (char it : expression.toCharArray()){
            if (it == '{' || it== '[' || it == '(' ) {
                st.push(it);
            }
            else {
                // check if the stack is empty or not this is for the avoid the first condation
                if (expression.isEmpty()) return  false ;
                char ch  = st.pop() ;
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else  return  false ;
            }
    }
        return st.isEmpty();
    }
//    public static boolean isValidParenthesis(String expression) {
// Write your code here.
//        // creat a stack to store the all of the elelemtn
//        Stack<Character> st = new Stack<>();
//        // Write your code here.
//        // creat a stack to store the all of the elelemtn
//        Stack<Character> st = new Stack<>();
//
//        if (expression.isEmpty()) return  false ;
//
//        st.push(expression.charAt(0));
//        int i =  1 ;
//        while (!st.isEmpty() && i != expression.length()){
//
//            char ch =  expression.charAt(i);
//            if (ch == '{' || ch == '[' || ch == '(') st.push(ch) ;
//
//            else st.pop() ;
//        }
//
//        return st.isEmpty();
//
//    }

}
