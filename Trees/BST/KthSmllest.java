package Trees.BST;



public class KthSmllest {
  public int count = 0 , ans = 0  ;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root , k );
      return  ans ;
    }
    private  void  inorder(TreeNode root , int k){
        if (root == null) return  ;
        inorder(root.left , k) ;
        count++ ;
        if (count == k){
            ans = root.data ;
            return;

        }
        inorder(root.right  , k );
    }
}
