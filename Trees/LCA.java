package Trees;

public class LCA {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) return  root  ;

        TreeNode leftP = lowestCommonAncestor(root.left , p , q ) ;
        TreeNode rightP  = lowestCommonAncestor(root.right , p , q) ;

        // check the result
        if (leftP == null) return  rightP ;

        else if (rightP == null) return  leftP ;

        // when both left and righ is null then  both p adn q are under the root node
        else {
            return root ;
        }

    }
}