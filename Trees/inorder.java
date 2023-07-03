package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class TreeNode{
    int data ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int data){
        this.data = data ;
        this.left = null;
        this.right = null ;
    }
}


public class inorder {
    // TODO 1 using Recursion
    public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.

        List<Integer> Inorder = new ArrayList<>();

        if (root == null) return  Inorder ;

       Inorder.addAll(getInOrderTraversal(root.left));
       Inorder.add(root.data);
       Inorder.addAll(getInOrderTraversal(root.right));


        return Inorder ;
    }

    /*
    We first take an explicit stack data structure and set an infinite loop.
   In every iteration we check whether our current node is pointing to NULL or not.
   If it is not pointing to null, we simply push the current value to the stack and move the current node to its left child.
  If it is pointing to NULL, we first check whether the stack is empty or not. If the stack is empty, it means that we have traversed the tree and we break out of the loop.
  If the stack is not empty, we pop the top value of the stack, print it and move the current node to its right child.
     */

    // TODO 1 _ trversal way
    static ArrayList < Integer > inOrderTrav(TreeNode curr) {
        ArrayList<Integer> inorder = new ArrayList<>()  ;
        Stack<TreeNode> s = new Stack<>() ;

        while (true){
            if (curr != null){
                // we have to insert the root
                s.push(curr);
                curr = curr.left ;
            }
            else {
                // check  stack is empty then we reverse all the elelemnt
                if (s.isEmpty()) break;
                curr = s.peek() ;
                inorder.add(curr.data);
                s.pop();
                curr = curr.right ;

            }
        }
        return inorder ;
    }


}
