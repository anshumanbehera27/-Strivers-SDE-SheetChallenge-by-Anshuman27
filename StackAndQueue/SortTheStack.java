package stack;
import java.util.* ;
import java.io.*;
import java.util.Stack;

public class SortTheStack {
    public static void sortStack(Stack<Integer>stack) {
        // Write your code here.
        if (stack.isEmpty())
            return;
        int temp = stack.peek();
        stack.pop();
        sortStack(stack);
        insert(stack,temp);
        return;
    }

    static void insert(Stack<Integer> st , int temp){
        if (st.isEmpty() || st.peek() < temp){
            st.push(temp);
            return;
        }
        int val = st.peek();
        st.pop();
        insert(st,temp);
        st.push(val);



    }


}
