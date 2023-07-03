package Trees;

import java.util.ArrayList;



public class Left_View_Of_Tree {

    public static ArrayList<Integer> getLeftView(TreeNode root)
    {
        ArrayList<Integer> LeftView = new ArrayList<>();


        findView(root , 0 , LeftView);

        return LeftView  ;
        //

    }

    static  void  findView(TreeNode root , int level  ,ArrayList<Integer> LeftView){

        // base case
        if (root == null ) return  ;
        // check the condation that
        // if  the element level is same as  the size of the DS then we are found our left view
        if (level ==  LeftView.size()) LeftView.add(root.data);
        // check the left part first
        findView(root.left , level+1 , LeftView);
        // check the right part
        findView(root.right , level+1 , LeftView);
    }

}
