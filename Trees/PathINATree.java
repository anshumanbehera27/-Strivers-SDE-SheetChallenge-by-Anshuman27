package Trees;

import java.util.ArrayList;

public class PathINATree {

    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        ArrayList<Integer>  res = new ArrayList<>();
        // base case
        if (root == null) return res ;

        FindPath(root , x , res);

       return res ;



    }
    static boolean FindPath(TreeNode root  , int x , ArrayList<Integer> res ){

        if (root == null) return false ;

        // case that my root is the target
        res.add(root.data) ;

        if (root.data == x) return  true  ;

        if (FindPath(root.left ,x , res) || FindPath(root.right , x , res)){
            return true ;
        }
        // when every not of then is going to true then we have to remove the elelement from the list
        res.remove(res.size()-1);
        return false  ;
    }
}
