package Trees;

public class DimaterOfBinarytree {
    public static int diameterOfBinaryTree(TreeNode root) {
        int dimeter[] = new int[1];
        height(root , dimeter);
        return dimeter[0] ;


    }

    private static int  height(TreeNode root, int[] dimeter) {
        if (root == null) return   0 ;
        int lh = height(root.left, dimeter) ;
        int rh = height(root.right , dimeter) ;
        dimeter[0] = Math.max( dimeter[0] , lh+rh);

        return  1 + Math.max(lh , rh) ;
    }
}
