package Trees;

public class maxiPathSum {
    public int maxPathSum(TreeNode root) {
        int maxapth[] = new int[1] ;
        maxapth[0] = Integer.MIN_VALUE ;
      FindMaxpath(root , maxapth);
       return maxapth[0] ;
    }

    private int FindMaxpath(TreeNode root, int[] maxapth) {
        if (root == null) return  0 ;
        // we have to avoid all the -ve number present in the  left and right path
        // we will use find the max with 0 and the node so we will only got the +ve value
        int leftSum = Math.max(0 , FindMaxpath(root.left , maxapth));
        int rightSum = Math.max(0 , FindMaxpath(root.right , maxapth)) ;

        maxapth[0] = Math.max(maxapth[0] , root.data + leftSum + rightSum ) ;

        return root.data + Math.max(leftSum , rightSum ) ;
    }
}
