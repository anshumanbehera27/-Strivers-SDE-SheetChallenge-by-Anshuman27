package Trees;

import java.util.ArrayList;

public class bottomView {
    public static ArrayList<Integer> bottomView(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> BottomView = new ArrayList<>();

        if (root == null) return BottomView;

        AddLeaf(root , BottomView);
        return BottomView;


    }
    static void  AddLeaf(TreeNode root , ArrayList<Integer> Ds){
        /*check that if the value if a leaf node then it is   persent at the bottom of the tree
        so we have to add it to out ds

        */

        if (isLeaf(root)){
            Ds.add(root.data);
            return;
        }

        if (root.left != null) AddLeaf(root.left, Ds) ;
        if (root.right != null) AddLeaf(root.right , Ds);



    }
    static boolean isLeaf(TreeNode node){
        if (node.left == null && node.right == null) return  true ;

        return false ;
    }
}
