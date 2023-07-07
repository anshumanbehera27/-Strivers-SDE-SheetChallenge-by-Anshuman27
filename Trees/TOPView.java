package Trees;

import java.util.*;
class Pair{
    TreeNode node ;
    int level ;
    public Pair(TreeNode node , int level){
        this.node = node ;
        this.level = level ;

    }
}
public class TOPView {

    public static ArrayList<Integer> getTopView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>() ;
        if (root == null) return  ans ;

        Map<Integer , Integer> map = new TreeMap<>() ;
        Queue<Pair> queue = new LinkedList<>() ;

        queue.add(new Pair(root , 0) );
        while (!queue.isEmpty()){
            Pair it = queue.poll() ;

            int level = it.level ;
            TreeNode temp = it.node  ;

            if (map.get(level) == null) map.put(temp.data,  level);

            if (temp.left != null){
                queue.add(new Pair(temp.left , level -1 ));
            }
            if (temp.right != null){
                queue.add(new Pair(temp.right , level +1)) ;

            }


        }
        for (Map.Entry<Integer , Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans ;


    }
}
