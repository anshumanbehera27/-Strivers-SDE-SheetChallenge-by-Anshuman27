package Array;

import java.util.ArrayList;
import java.util.List;

public class ch {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() ;
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(2);
        System.out.println( repeatedNumber(list));
    }
    public static int repeatedNumber(final List<Integer> A) {
         int slow = 0 ;
         int fast = 0 ;
         do{
             slow = A.get(slow) ;
             fast = A.get(A.get(fast));

         }while (slow != fast);
         // they will meet somewhere
        slow = 0 ;
        while (slow != fast){
            slow = A.get(slow);
            fast = A.get(fast);
        }
        return slow;

    }
}
