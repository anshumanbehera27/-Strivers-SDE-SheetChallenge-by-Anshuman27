package Trees;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        //base case
        if(root == null) return  false ;
        // check that the element we are in is the equal to the target or not
        if (root.left == null && root.right == null && targetSum - root.data == 0){
            return true ;
        }
        return hasPathSum(root.left , targetSum - root.data ) || hasPathSum(root.right , targetSum - root.data);

    }

}
