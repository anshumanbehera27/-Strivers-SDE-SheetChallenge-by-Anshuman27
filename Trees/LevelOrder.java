package Trees;

import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static ArrayList<Integer> getLevelOrder(TreeNode root) {
        ArrayList<Integer> level = new ArrayList<>() ;
        Queue<TreeNode> queue = new LinkedList<>() ;
        // check it is null or  not
        if (root == null) return  level ;

        // Add the first node to the Queue
        queue.add(root) ;
        while (!queue.isEmpty()){
            // size of the queue
            int size = queue.size() ;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.peek() ;
                if (node.left != null) queue.add(node.left) ;
                if (node.right != null) queue.add(node.right) ;

                level.add(queue.poll().data);
            }

        }
        return level ;
    }

}
