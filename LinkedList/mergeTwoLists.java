package LinkedList;

public class mergeTwoLists {
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(-101) ;
        ListNode pointer = dummyHead;

        while (list1 != null && list2 != null){

            if (list1.val < list2.val){
                pointer.next = list1;
                list1  = list1.next ;
                pointer = pointer.next ;
            }
            else {
                pointer.next = list2 ;
                list2 = list2.next ;
                pointer = pointer.next ;
            }
        }
        while (list1 != null){
            pointer.next = list1 ;
            list1 = list1.next;
            pointer = pointer.next ;
        }
        while (list2 != null){
            pointer.next = list2 ;
            list2 = list2.next ;
            pointer = pointer.next;
        }
        return dummyHead.next ;
    }

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummyHead  = new ListNode(101) ;
//        ListNode Point  = dummyHead ;
//
//        // base case
//        if (list1 == null) return  list2  ;
//        if (list2 == null) return  list1 ;
//
//        // how to define the the pointer is of list one pinter
//        ListNode l1 = list1 ;
//        ListNode l2 =  list2 ;
//        while (l1 != null && l2 != null){
//
//            if (l1.val == l2.val){
//                l1 = l1.next ;
//                l2 = l2.next ;
//                Point.next = new ListNode(l1.val) ;
//            }
//            else if (l1.val < l2.val){
//                l1 = l1.next ;
//                Point.next = new ListNode(l1.val);
//            }
//            else if (l1.val > l2.val){
//                l2 = l2.next ;
//                Point.next = new ListNode(l2.val);
//            }
//        }
//        while (l1 != null){
//            Point.next = new ListNode(l1.val);
//            l1 = l1.next ;
//        }
//        while (l2 != null){
//            Point.next = new ListNode(l2.val);
//            l2 = l1.next ;
//        }
//
//        return dummyHead;
//
//
//
//    }

}
