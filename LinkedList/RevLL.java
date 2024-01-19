package LinkedList;

public class RevLL {

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null ;
        ListNode present = head ;
        ListNode next = present.next ;

        while (present != null){

            present.next = prev;
            prev = present ;
            present = next;
            if (next.next!= null){
                next = next.next;

            }
        }
        return prev ;


    }


}
