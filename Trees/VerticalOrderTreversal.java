package Trees;

import java.util.*;

public class VerticalOrderTreversal {

    // TODO 1 creat a constractor for using 3 value
    class Tuple{
        TreeNode node  ;
        int row ;
        int col ;
        public  Tuple(TreeNode node , int row , int col){
            this.node = node ;
            this.col = col ;
            this.row = row ;

        }
    }



    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // TODO 2 assine all the vertical and level to the  tree
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>() ;
        // here we will use Map to store all od the node inn -2 to 2 order
        // priority queue is help us to sort the array

        Queue<Tuple> queue = new LinkedList<>() ;
        queue.offer(new Tuple(root , 0 , 0)) ;

        while (!queue.isEmpty()){
            Tuple tuple = queue.poll()  ;
            TreeNode node = tuple.node ;
            int x = tuple.row ;
            int y = tuple.col  ;
            // TODO 3 Store in the DS  all of the vertical and level we will assine to the queue
            if (!map.containsKey(x)){
                map.put(x , new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)){
                map.get(x).put(y , new PriorityQueue<>());

            }
            map.get(x).get(y).offer(node.data);
            // check for the left side to assine the vertical and level
            if (node.left != null){
                queue.offer(new Tuple(node.left , x-1 , y+1));
            }
            // check for the right
            if (node.right != null){
                queue.offer(new Tuple(node.right , x +1 , y+1));
            }

        }
        // TODO 4 we have to inset it to the 2d list of the array
        List < List < Integer >> list = new ArrayList < > ();
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;




    }
}
