package Trees;

public class FloorINBST {
    public static int floorInBST(TreeNode root, int X) {
        int floor = -1 ;
        while (root != null){
            // if we are find the val at root
            if (root.data == X) {
                floor = root.data ;
                return  floor ;
            }
            else if (X >root.data){
                floor = root.data ;
                root = root.right ;
            }
            else {
                root = root.left ;
            }
        }
        return floor ;

    }
}
