package stack;

import java.util.LinkedList;
import java.util.Queue;

public class implimetStackUsingQueue {

    class MyStack {
        Queue<Integer> queue = new LinkedList<>();
        public MyStack() {


        }

        public void push(int x) {
            // first we  have to add it to the queue
            // and then remove the  element from the queue and push back to the queue so we are able to mantaqin Th FIFO
            queue.add(x);
            for (int i = 0; i < queue.size() -1 ; i++) {
                queue.add(queue.remove());
            }

        }

        public int pop() {
            return queue.remove();

        }

        public int top() {
            return queue.peek();

        }


        public boolean empty() {
            return  (queue.size() == 0 );


        }
    }

}
