package stack;

import java.util.Stack;

public class MinStack {
    //define the stack
    Stack<Long> st = new Stack<>() ;
    Long mini ;
    MinStack() {
        // Write your code here.
        mini = Long.MAX_VALUE ;
    }

    // Function to add another element equal to num at the top of stack.
    void push(int num) {
        // convert  the int to the long
        Long val = Long.valueOf(num);
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);
                mini = val;

            } else {
                st.push(val);
            }
        }
       
    }
    // Function to remove the top element of the stack.
    void pop() {
            if (st.isEmpty()) return ;
           Long val = st.pop();
            if (val < mini) {
                mini = 2 * mini - val;


            }
            return  ;
        }

    // Function to return the top element of stack if it is present. Otherwise
    // return -1.
    int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();

        }
        return val.intValue();
    }
    // Function to return minimum element of stack if it is present. Otherwise
    // return -1.
    int getMin() {
        // Write your code here.
        return  mini.intValue();
    }

}
