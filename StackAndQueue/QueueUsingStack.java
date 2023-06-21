package stack;

import java.util.Stack;

public class QueueUsingStack {
    public class Queue {
        // Define the data members(if any) here.
      Stack<Integer> input ;
      Stack<Integer> output ;


        Queue() {
            // Initialize your data structure here.
            this.input = new Stack<>();
            this.output = new Stack<>();
        }

        void enQueue(int val) {
            // Implement the enqueue() function.
            // push the element
            input.push(val);
        }

        int deQueue() {
            // Implement the dequeue() function.
            //Removes the element from in front of queue and returns that element.
            // check out is empty  or not
            if (output.isEmpty()){
                while (!input.isEmpty()){
                    output.push(input.peek());
                    input.pop();

                }
            }
            int x = output.peek();
            output.pop();
            return x ;

        }

        int peek() {
            // Implement the peek() function here.
            if (output.empty())
            {
                while (!input.isEmpty()){
                    output.push(input.peek());
                    input.pop();
                }
            }
            return output.peek();
        }

        boolean isEmpty() {
            // Implement the isEmpty() function here.
            if (output.size() + input.size() == 0) return  true ;
            return  false ;
        }
    }
}
