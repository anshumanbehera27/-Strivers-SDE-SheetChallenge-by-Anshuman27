package LinkedList;

public class Middleelement {
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
    public ListNode middleNode(ListNode head) {
        ListNode  fast = head ;
        ListNode slow = head ;
        while (fast != null){
            fast = fast.next.next ;
            slow = slow.next;
        }
        return slow;

    }




}
