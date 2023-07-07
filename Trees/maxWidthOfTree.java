package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class maxWidthOfTree {

    public int widthOfBinaryTree(TreeNode root) {
        List<List<Integer>> res = levelOrder(root) ;
        int maxi = 0 ;

        for (int i = 0; i < res.size(); i++) {
            int len  = res.get(i).size();
            maxi = Math.max(maxi , len ) ;
        }
        return maxi;

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        // base case
        if (root == null) {
            return wrapList;
        }
        // add the value of root into the queue
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().data);

            }
            wrapList.add(sublist);

        }
        return wrapList;
    }
}
