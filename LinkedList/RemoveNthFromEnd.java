package LinkedList;

public class RemoveNthFromEnd {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //  how to find the index = size of the list  - n +1 ;
        int index = count(head) - n  + 1 ;

        if (index == 1) return  head.next ;

        // find the prev node for  this index
       int u = 0 ;
        ListNode prev = null ;
        ListNode curr = head ;
        while (curr != null){
            u++ ;
            if (u == index){
                prev.next = curr.next ;
            }
            prev = curr ;
            curr = curr.next;
        }

        return head ;

    }

    static int count(ListNode head){
        ListNode temp   = head ;
        int count = 0 ;
        while (temp != null){
            count++ ;
            temp = temp.next ;

        }
        return count ;
    }

}
