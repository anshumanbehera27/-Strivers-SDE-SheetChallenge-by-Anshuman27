package LinkedList;

import java.util.LinkedList;

public class swapNodes {

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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode ll = head;
        int size = 0 ;
        while (ll != null) {
            head = head.next;
            size++ ;
        }
        // find the first node of LL
        ListNode first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;

        }
        // find the sec node
        ListNode second = head;
        for (int i = 1; i <= size -k; i++) {
            second = second.next;

        }
        // now swap both of the node
        int x = first.val;
        first.val = second.val;
        second.val =  x;

        return head;


    }


//    public  ListNode swapNodes(ListNode head, int k) {
//        // find the size of LL
//        ListNode ll = head;
//        int len = 0 ;
//        while (ll != null) {
//            head = head.next;
//            len++ ;
//        }
//        // create an array
//        int[] arr = new int[len];
//        //conver the ll to array
//        ListNode temp = head;
//        int  i  = 0 ;
//        while (temp != null){
//            arr[i] = temp.val;
//            temp = temp.next;
//        }
//
//        Swappair(arr , k , k*2);
//
//        // now convert the Array to LL
//        ListNode LL  = new ListNode(0);
//        ListNode ch = LL;
//        for (int ele :arr){
//            ch.next = new ListNode(ele);
//            ch = ch.next ;
//        }
//        return  LL.next;
//
//
//
//    }
//    static void Swappair(int[]arr , int a , int b){
//
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp ;
//    }



}
