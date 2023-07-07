package Trees;

public class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return  true ;

        if (p == null || q == null) return  false ;

        // check the root val of both
        if (p.data !=q.data) return  false ;
        return  isSameTree(p.left , q.left)  && isSameTree(p.right , q.right) ;

    }


}
