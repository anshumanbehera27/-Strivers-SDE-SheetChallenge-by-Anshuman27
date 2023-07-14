package Trees;

public class InvertBinaryTrees {
    public TreeNode invertTree(TreeNode root) {
       // check for the base case
       if(root == null) return  null ;

       TreeNode  right = root.right ;
       root.right  = invertTree(root.left) ;
       root.left = invertTree(right ) ;


       return  root ;

    }

}
