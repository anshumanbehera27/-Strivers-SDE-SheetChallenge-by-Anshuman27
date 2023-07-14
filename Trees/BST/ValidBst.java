package Trees.BST;



public class ValidBst {
    public boolean isValidBST(TreeNode root) {

        return  checkValid(root , Long.MIN_VALUE , Long.MAX_VALUE) ;

    }

    private boolean checkValid(TreeNode root,
                               Long minValue, Long maxValue) {
        if (root == null) return true ;

        if (root.data >= maxValue || root.data <= minValue) return  false ;

        return  checkValid(root.left , minValue , (long) root.data) && checkValid(root.right , (long)root.data , maxValue) ;
    }
}
