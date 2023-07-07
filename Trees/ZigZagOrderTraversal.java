package Trees;

import java.util.*;

public class ZigZagOrderTraversal {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                List<List<Integer>> ans = new ArrayList<>();
                Queue<TreeNode> queue = new LinkedList<>();

                if (root == null) return ans;
                queue.add(root);
                int level = 0;
                while (!queue.isEmpty()) {
                        List<Integer> temp = new ArrayList<>();
                        int size = queue.size();
                        for (int i = 0; i < size; i++) {
                                TreeNode node = queue.peek();
                                if (node.left != null) queue.add(node.left);
                                if (node.right != null) queue.add(node.right);


                                temp.add(queue.poll().data);


                        }
                        if (level % 2 == 0) ans.add(temp);
                        else {
                                Collections.reverse(temp);
                                ans.add(temp);
                        }
                }
                return ans;

        }
}
