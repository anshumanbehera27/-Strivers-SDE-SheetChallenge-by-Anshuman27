package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextsmallerElement
{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // creat an arraylist
        ArrayList<Integer> ans = new ArrayList<>();
        // creat stack
        Stack<Integer> st  = new Stack<>() ;
        for (int i = n-1; i >= 0; i--) {

            while (st.isEmpty() == false && st.peek() >= arr.get(i)){
                // we have to remove that element
                st.pop() ;
            }
            if (st.isEmpty() == false){
                ans.add( st.peek());
            }
            else ans.add( -1 );

            st.push(arr.get(i));
        }
        Collections.reverse(ans);

        return ans  ;
    }
}
