package LinkedList;

public class FindTheIntersectionNode {

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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // find the length of the both the linkedlist
        int len1 = findlen(headA);
        int len2 = findlen(headB) ;

        // find the diffrence between them
        int diff = len1 - len2 ;
        // if diffrence is greater then zero then we have to go for the head 2
        if (diff < 0) while (diff++ != 0) headB  = headB.next ;
        else while (diff-- != 0) headA = headA.next ;

        // now we will find the where we will able to get the intersection point
        while (headA != null){
            if (headA == headB ) return  headA ;
            headB  = headB.next;
            headA = headA.next ;
        }
        return headA;

    }
    static  int findlen(ListNode head){
        ListNode ll = head ;
        int len = 0 ;
        while (ll != null){
            len++ ;
            ll = ll.next ;
        }
        return len ;
    }
}
