package LinkedList;

public class hasCycle {
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

}
