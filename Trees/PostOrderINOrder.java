package Trees;

import java.util.HashMap;
import java.util.Map;

public class PostOrderINOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder == null || postorder == null || inorder.length != postorder.length ) return  null ;
        // TODO 1:  we  have to create a map to acess the value easily
        Map<Integer  , Integer> map = new HashMap<>();

        // TODO: Store all the element of  Inorder in to the map
        for (int i = 0; i < inorder.length; i++) {
            map.put( inorder[i] ,i);

        }
        // TODO:  We have to find the root which the first ele of the perorder
        TreeNode root = buildTreeINpost(postorder , 0 , postorder.length -1 , inorder , 0 , inorder.length -1 , map) ;

        return root;

    }
    private TreeNode buildTreeINpost(int[] postorder, int posStart, int posEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        // check the base for array ele

        if (posStart > posEnd || inStart > inEnd) return  null;

        // creat a root node
        TreeNode root = new TreeNode(postorder[posEnd]) ;
        int inRoot = map.get(postorder[posEnd]) ;
        int numsLeft = inRoot - inStart ;
        root.left = buildTreeINpost(postorder , posStart  ,posStart+ numsLeft -1 , inorder ,inStart , inRoot -1 , map );
        root.right = buildTreeINpost(postorder , posStart +numsLeft ,posEnd -1, inorder ,inRoot+1 , inEnd, map );
        return root ;

    }
}
