//package string;
//
//import LinkedList.AddTwoNumbers;
//public class ListNode {
//    int val;
//     ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//public class test {
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        // base  case when  size is zero
//        if (lists.length == 0) return null;
//        return mergSort(lists, 0, lists.length - 1);
//
//    }
//
//    public static ListNode mergSort(ListNode[] lists, int start, int end) {
//        // base case
//        if (start == end) {
//            return lists[start];
//
//        }
//        int mid = start + (end - start) / 2;
//        ListNode left = mergSort(lists, start, mid);
//        ListNode right = mergSort(lists, mid + 1, end);
//        return merg(left, right);
//    }
//
//    public static ListNode merg(ListNode list1, ListNode list2) {
//
//         /*
//        1 - define a merg LL
//        2 - we will  define the two pointer for each LL
//        3 -   by using while loop we just compare the value
//        4 - if some of the lenght is greter then we need to add that in to our LL
//        */
//        ListNode mergLL = new ListNode(0);
//        ListNode temp = mergLL;
//        ListNode head1 = list1;
//        ListNode head2 = list2;
//
//        while (head1 != null && head2 != null) {
//            if (head1.val < head2.val) {
//                temp.next = new ListNode(head1.val);
//                head1 = head1.next;
//                temp = temp.next;
//            } else {
//                temp.next = new ListNode(head2.val);
//                head2 = head2.next;
//                temp = temp.next;
//            }
//        }
//
//        while (head1 != null) {
//            temp.next = new ListNode(head1.val);
//            head1 = head1.next;
//            temp = temp.next;
//        }
//        while (head2 != null) {
//            temp.next = new ListNode(head2.val);
//            head2 = head2.next;
//            temp = temp.next;
//        }
//        return mergLL.next;
//    }
//}
