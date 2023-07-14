package Trees.BST;

public class LowestCommonAnsistor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return   null ;
        int curr = root.data ;
        if (curr < p.data && curr < q.data) {
            return  lowestCommonAncestor(root.right , p , q) ;

        }
        if (curr > p.data && curr > q.data) {
            return  lowestCommonAncestor(root.left , p , q) ;
        }
        return root ;

    }
}
