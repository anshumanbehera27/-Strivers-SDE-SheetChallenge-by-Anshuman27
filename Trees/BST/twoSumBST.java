package Trees.BST;

import java.util.ArrayList;
class Node{
    int data;
    Node left,right;
    Node(int val)
    {
        data=val;
        left=null;
        right=null;
    }
}
public class twoSumBST {

    public static boolean findTarget(Node root, int k) {

        // base case
        if (root == null) return false;
        // we need to convert the BST Into a sorterd Array
        ArrayList<Integer> arr = new ArrayList<>();

        // we need Sorted so we have to call the inorder Traversal
        Inorder(root, arr);

      int i = 0 ;
      int j = arr.size() -1 ;
      while (i < j){
          int sum = arr.get(i ) + arr.get(j)  ;

          if (sum == k) return  true ;
          else if (sum > k ) j-- ;
          else  i++ ;

      }
      return false ;


    }

    private static void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;

        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.left, arr);

    }

    static Node insertBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[]={5,3,6,2,4,7},i;

        int k=9;
        Node root=null;
        for(i=0;i<arr.length;i++)
        {
            root=insertBST(root,arr[i]);
        }
        System.out.println(  findTarget(root ,k));


    }

}