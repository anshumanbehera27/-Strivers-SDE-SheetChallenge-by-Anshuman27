package LinkedList;

public class lenghtOFcycle {
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

}
