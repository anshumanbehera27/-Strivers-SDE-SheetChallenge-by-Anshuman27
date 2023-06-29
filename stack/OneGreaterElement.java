package stack;

import java.util.Stack;

public class OneGreaterElement {
    public static int[] nextGreater(int[] arr, int n) {
        // create a oneGreater array where i can store the ans
        // create a stack for storing the element

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>() ;
        // i have to check all the right half of the array and left half of the array aswell so i will set my index as 2n

        for (int i = 2* n -1; i >= 0 ; i--) {
            if (!st.isEmpty() && st.peek() <= arr[i%n]){
                // we found the small elelment in that driction
                // we have to remove the paticular element
                st.pop();
            }
            if (i < n ){
                if (st.isEmpty() == false){
                    ans[i] = st.peek() ;
                }
                // if it is empty then  there is no greater element present in the array
                // set it as -1
               else ans[i] = -1  ;
            }
            st.push(arr[i%n]);

        }

        return ans ;




    }
}
