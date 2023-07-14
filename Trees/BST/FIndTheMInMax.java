package Trees.BST;

public class FIndTheMInMax {
    public static int minValue(TreeNode root) {
        // Write your code here.
        if (root == null) return   0 ;
        int min = root.data;

        while (root != null){

            min = Math.min(min , root.left.data) ;
            root = root.left ;


        }
        return  min ;
    }
}
