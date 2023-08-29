package Trees;

public class CeliINBst {
    public  static int findCeil(TreeNode node, int x) {
        int celi = -1 ;
        if (node.data == x){
            celi = node.data ;
            return  celi ;
        }
        else if (x < node.data){
            celi = node.data ;
            node = node.left ;
        }
        else {
            node = node.right ;
        }
        return celi ;
    }


    }
