package stack;



/*
    Time complexity: O(N)
    Space complexity: O(N)
    
    Where 'N' is the number of people at the party.
*/
	
import java.util.Stack;

public class FIndCelebraty {
    public static int findCelebrity(int n) {

        // Create a stack and push all ids in it.
        Stack<Integer> ids = new Stack<Integer>();
        for(int i = 0; i < n; i++) {
            ids.push(i);
        }

        // Finding celebrity.
        Object Runner;
        while(ids.size() > 1) {
            int id1 = ids.peek();
            ids.pop();
            int id2 = ids.peek();
            ids.pop();

            if(Runner.knows(id1, id2)) {
                // Because person with id1 can not be celebrity. 
                ids.push(id2);
            }
            else {
                // Because person with id2 can not be celebrity.
                ids.push(id1);
            }
        }

        int celebrity = ids.peek();
        boolean knowAny = false, knownToAll = true;

        // Verify whether the celebrity knows any other person.
        for(int i = 0; i < n; i++) {
            if(Runner.knows(celebrity, i)) {
                knowAny = true;
                break;
            }
        }

        // Verify whether the celebrity is known to all the other person.
        for(int i = 0; i < n; i++) {
            if(i != celebrity && !Runner.knows(i, celebrity)) {
                knownToAll = false;
                break;
            }
        }

        if(knowAny || !knownToAll) {
            // If verificatin failed, then it means there is no celebrity at the party.
            celebrity = -1;
        }

        return celebrity;
    }
}