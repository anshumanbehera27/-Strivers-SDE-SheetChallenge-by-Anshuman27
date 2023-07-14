package Trees.BST;

public class BSTfrompreorder {
    public TreeNode preOrderTree(int[] preorder) {
        if (preorder.length == 0) return  null ;
        return PreorderTOBst(preorder , Integer.MAX_VALUE , new int[]{0}) ;
    }
    public static TreeNode PreorderTOBst(int[] A , int bound  , int[] i ){

        // check the base case first
        if (i[0] == A.length || A[i[0]] > bound) return  null ;
        // when we reach the end of the tree then we have to return  null
        // while traversing we will found some grater ele then  bound then we have to return the null
        TreeNode root = new TreeNode(A[i[0]++]) ;

        root.left =  PreorderTOBst(A, root.data , i) ;
        root.right = PreorderTOBst(A , bound , i) ;

        return  root ;
    }



}
