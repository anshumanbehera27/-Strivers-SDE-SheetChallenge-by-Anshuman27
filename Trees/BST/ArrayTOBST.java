package Trees.BST;

public class ArrayTOBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return arrToBst(nums , 0 , nums.length -1 );

    }
    static TreeNode arrToBst(int[] nums , int s , int e ){
        if (s > e) return   null ;

        int mid  = s  + (e - s) / 2  ;
        TreeNode root = new TreeNode(nums[mid]) ;
        root.left = arrToBst(nums , s, mid-1) ;
        root.right = arrToBst(nums , mid +1 , e) ;

        return root ;

    }
}
