package resursionREv;

import java.util.Stack;

public class SortaStackUsingRec {
    public Stack<Integer> sort(Stack<Integer> s)
    {
        if(s.isEmpty()) return  s ;
        int topelement = s.pop();
        Stack<Integer> sortedStack = sort(s);
        insertInSortedOrder(sortedStack , topelement);

        return sortedStack ;

        //add code here.
    }
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element < stack.peek()) {
            stack.push(element);
            return;
        }

        for (int i = stack.size() -1 ; i >= 0; i--) {
            if (stack.get(i) <  element) {
                stack.insertElementAt(element, i + 1);
                return;
            }
        }

        stack.push(element);
    }
}
