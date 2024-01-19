package LinkedList;

public class checkStartpointofTheNode {
    class ListNode{
    int val ;
    ListNode next ;
    ListNode(int val){
        this.val = val ;
    }
    ListNode(int val , ListNode next){
        this.val = val ;
        this.next = next ;

    }
}

//  we need to first check cycle or not

    public boolean hasCycle(ListNode head) {
        ListNode fast = head ;
        ListNode slow  = head ;

        while (fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
            if (fast == slow) return  true;
        }
        return  false ;
    }
    //  we need to fixed the slow pointer and take dummy node and count ultil the it is equal to slow
    public int lengthCycle(ListNode head) {
        ListNode fast = head ;
        ListNode slow  = head ;

        while (fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
            if (fast == slow) {
                ListNode temp = slow;
                int len = 0 ;
                do {
                    temp = temp.next;
                    len++;
                }while (temp!= slow);
                return len;
            }
        }
      return  0;
    }
    public ListNode detectCycle(ListNode head) {
        // check cycle is present or not
        if (hasCycle(head) == true){
            int length = lengthCycle(head);
            ListNode fast  = head;
            ListNode slow = head;
            // now we have to move till teh slow point of the linklist
            while (length >0){
                slow= slow.next;
                length--;
            }
            while (fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;


        }
        else return null;

    }


}
