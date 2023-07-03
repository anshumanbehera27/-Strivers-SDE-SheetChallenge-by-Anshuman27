package Trees;

import java.util.ArrayList;
import java.util.List;

public  class PostOrderTraversal {
    public static List<Integer> getPostOrderTraversal(TreeNode root) {

        List<Integer> PostOrder = new ArrayList<>()  ;

        postOrder_helper(root  , PostOrder );


        return PostOrder ;

    }

    private static void postOrder_helper(TreeNode root, List<Integer> postOrder) {
        // base case
        if (root == null) return;

        // check left
        postOrder_helper(root.left , postOrder);
        // check right
        postOrder_helper(root.right  , postOrder);

        postOrder.add(root.data) ;
    }


}