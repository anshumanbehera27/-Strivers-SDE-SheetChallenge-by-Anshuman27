package Trees.BST;

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

public class SearchINABinaryTree {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null){
            if (root.data == val) return  root ;

            if (root.data > val){
                root = root.left ;
            }
            else if (root.data < val){
                root = root.right ;

            }
        }
        return root ;

    }
}
