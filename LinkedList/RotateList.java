package LinkedList;

public class RotateList {
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

    public ListNode rotateRight(ListNode head, int k) {
        // check the base case
        if (head == null || head.next != null || k == 0) return head;

        // find the len of teh ll
        int len = 1;
        ListNode curr  = head ;
        while (curr.next != null){
            curr = curr.next ;
            len++ ;
        }
        // connect the end of the linked-list to the head of the list
        curr.next = head ;
        k = k % len ;
        int skip = len - k ;
        ListNode newLast = head;

        while (skip != 0){
            skip--;
             newLast = newLast.next ;
        }
        // make the node head and break the connection
        head = newLast.next;
        newLast.next = null;

        return head ;
    }


        public ListNode rotateRight1(ListNode head, int k) {
        ListNode ans = new ListNode(0);
        while (k != 0){
            removelastAddfirst(head);
            k-- ;
        }
        return ans.next ;

    }
   public ListNode removelastAddfirst(ListNode head){
        // find the prev_Index
        ListNode temp = head ;
        while (temp.next != null){
            temp = temp.next ;
        }
        // remove the value
        int val = temp.val;
        temp.next = null;
        ListNode node = new ListNode(val);
        node.next = head ;
        head = node ;

        return head ;


    }
}
