package Trees;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
public class PerOderINOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO 1:  we  have to create a map to acess the value easily
        Map<Integer  , Integer> map = new HashMap<>();

        // TODO: Store all the element of  Inorder in to the map
        for (int i = 0; i < inorder.length; i++) {
            map.put( inorder[i] ,i);

        }
        // TODO:  We have to find the root which the first ele of the perorder
        TreeNode root = buildTree(preorder , 0 , preorder.length -1 , inorder , 0 , inorder.length -1 , map) ;

        return root;

    }
    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        // check the base for array ele

        if (preStart > preEnd || inStart > inEnd) return  null;

        // creat a root node
        TreeNode root = new TreeNode(preorder[preStart]) ;
        int inRoot = map.get(root.data) ;
        int numsLeft = inRoot - inStart ;
        root.left = buildTree(preorder , preStart +1 ,preStart+ numsLeft , inorder ,inStart , inRoot -1 , map );
        root.right = buildTree(preorder , preStart +numsLeft+1 ,preEnd , inorder ,inRoot+1 , inEnd, map );
        return root ;

    }
}