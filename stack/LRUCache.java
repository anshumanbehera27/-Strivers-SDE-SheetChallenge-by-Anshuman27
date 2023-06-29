package stack;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // for impliment this we have to use the LinkedList and HashMap
    // TODO 1 - Define the node Class for DD LL
    class Node{
        Node prev ;
        Node next ;
        int key , val ;
        Node(int key , int val){
            this.key = key;
            this.val = val;
        }
    }
    // TODO 2 - Define the Hashmap And DD
    // Define head and tail of LL
    Node head = new Node(0 , 0);
    Node tail = new Node(0 , 0 );
    Map<Integer , Node> map = new HashMap<>();
    int capacity ;

    // TODO 3 : Make the constrature
    // connect the head and tail
    public  LRUCache(int capacity)
    {
        this.capacity = capacity;
        head.next = tail ;
        tail.prev = head ;
    }
// TODO 4 : make the get key by using hash Map
    public int get(int key)
    {
        if (map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            Insert(node);
            return node.val ;
        }
        else return  -1 ;

    }
// TODO 5: make the put key
    public  void  put(int key , int val){
        if (map.containsKey(key)){
            remove(map.get(key));
        }
        if (map.size() ==capacity){
            remove(tail.prev);
        }
        Insert(new Node(key , val));
    }
    public void Insert(Node node)
    {

        map.put(node.key,  node);
        node.next = head.next ;
        node.next.prev = node ;
        head.next = node ;
        node.prev = head ;

    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
