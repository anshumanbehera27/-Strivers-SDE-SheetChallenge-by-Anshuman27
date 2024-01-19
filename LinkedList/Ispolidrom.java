package LinkedList;

public class Ispolidrom {

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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        // find the midpoint of the linkedlist
        ListNode f = head;
        ListNode s = head;
        while (f.next != null && f.next.next!= null){
            f = f.next.next;
            s = s.next;
        }
        // After moving in this we will find our mid point
        s.next = reverseList(s.next);
        s  = s.next;
        ListNode dummy  = head;
        while (s != null){
            if (dummy.val != s.val) return false;
            dummy = dummy.next;
            s = s.next;
        }
        return true;

    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        ListNode next = null ;

        while (head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev ;


    }


}
