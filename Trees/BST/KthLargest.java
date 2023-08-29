package Trees.BST;

public class KthLargest {
    public int count = 0 , ans = 0  ;
    public int kthLargest(TreeNode root, int k) {
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
