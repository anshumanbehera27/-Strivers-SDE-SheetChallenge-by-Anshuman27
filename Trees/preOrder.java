package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class preOrder {
    public static List< Integer > getPreOrderTraversal(TreeNode root) {
        // Write your code here.
        List< Integer > Inorder = new ArrayList<>() ;

        perorder(root , Inorder);

        return Inorder ;

    }

   public static void perorder(TreeNode root, List<Integer> inorder) {
       // base case
       if (root == null) return;

       inorder.add(root.data);
       perorder(root.left , inorder);

       perorder(root.right , inorder);
    }

    // Post Order Trversal in the itrative way
    public List<Integer> perorderTraversal(TreeNode root){
        List<Integer> perorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>() ;

        if (root  == null) return  perorder ;
        st.push(root);
        while (!st.isEmpty()){
            root = st.pop()  ;
            perorder.add(root.data);
            if (root.right != null){
                st.add(root.right);

            }
            if (root.left != null){
                st.add(root.left);
            }
        }
        return perorder  ;



    }


}
