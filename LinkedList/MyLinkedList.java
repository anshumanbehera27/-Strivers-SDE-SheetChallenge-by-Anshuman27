package LinkedList;

public class MyLinkedList {
    // define my siz properties of my linkedlis
    Node head ;
   private Node tail ;
   private  int size ;
    public MyLinkedList() {
      this.size  = 0 ;
    }
    // how to create a node of the linkedlist
    class Node{
        int val ;
        Node next ;
        Node(int val){
            this.val = val ;
        }
        Node(int val , Node next){
            this.val = val ;
            this.next = next ;

        }
    }


      public  void  display(){
        Node temp = head ;
        while (temp != head){
            System.out.print(temp.val + "->");
            temp = temp.next ;
        }
      }


    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next  = head ;
        head = node ;
        if (head == null){
            tail = head ;
        }
        size++ ;

    }
    public void addAtTail(int val) {
        if (tail == null){
            addAtHead(val);
        }

        Node node = new Node(val);
        tail.next = node ;
        tail = node ;

    }
    public void addAtIndex(int index, int val) {

        // if index = 0
        if (index == 0) {
            addAtHead(val);
        }
        if (index == size){
            addAtTail(val);
        }
        // find the prev element
        Node prev = head ;
        for (int i = 0; i < index; i++) {
            prev  = prev.next ;

        }

        Node node = new Node(index , prev.next) ;
        prev.next = node ;
        size+=1 ;


    }
    public  Node get1(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;


        }
        return node;
    }
    public int get(int index) {
        Node temp   = head ;
        int   i = 0;
        while (temp != null){
            int val = temp.val;
            if (i == index){
                return val ;
            }
            temp  = temp.next ;

        }
        return   -1 ;

    }
    public int deleteFirst(){
        int val = head.val;
        head =head.next ;
        if (head == null){
            tail = null ;
        }
        size-- ;
        return  val ;
    }
    public  int deleteLast(){
        // base case
        if (size <= 1){
            return deleteFirst();
        }
        Node secondlast = get1(size - 2);
        int val = tail.val;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public void deleteAtIndex(int index) {
        if (index == 0){
            deleteFirst();
        }
        if (index == size-1){
            deleteLast();
        }
        Node prev = get1(index -1 ) ;
        int val = prev.next.val;
        prev.next = prev.next.next ;

        System.out.println(val);

    }



}
