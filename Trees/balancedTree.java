package Trees;

public class balancedTree {
    public boolean isBalanced(TreeNode root) {
        return bfshight(root) != -1 ;

    }
    static int bfshight(TreeNode root){
        if (root == null) return  0 ;

        int lh = bfshight(root.left) ;
        if (lh == -1) return -1 ;
        int rh  = bfshight(root.right) ;
        if (rh == -1) return  -1 ;
        if (Math.abs(lh - rh) > 1) return  -1 ;

        return 1 + Math.max(lh , rh ) ;
    }
}
