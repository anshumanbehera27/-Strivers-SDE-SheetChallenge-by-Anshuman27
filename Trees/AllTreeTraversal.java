package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//class Pair{
//    TreeNode node ;
//    int num ;
//    public Pair(TreeNode node , int num){
//        this.node = node ;
//        this.num  = num ;
//
//    }
//}
public class AllTreeTraversal {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> per = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post  = new ArrayList<>();

       // Base case

        if (root == null) return  result ;
        // we have to add it to Stack to check the level of it
        Stack<Pair> st = new Stack<>() ;
        st.push(new Pair(root , 1));

        while (!st.isEmpty()){
            Pair it = st.pop() ;
            // this is part of the pre
            // increment 1 to 2
            // push the left  Side of the tree
            if (it.level == 1) {
                per.add(it.node.data);
                it.level++;
                st.push(it);

                if (it.node.left != null) {
                    st.push(new Pair(it.node.left, 1));
                }
            }
            // this part  is for inorder
            // incremt 2 to 3
            // push right
            else if(it.level == 2){
                in.add(it.node.data);
                it.level++ ;
                st.push(it);

                if (it.node.right != null){
                    st.push(new Pair(it.node.right , 1 )) ;
                }

            }
            // Don't push it back Again
            else {
                post.add(it.node.data);
            }
        }

        result.add(in);
        result.add(per);
        result.add(post) ;


        return result ;




    }
}
