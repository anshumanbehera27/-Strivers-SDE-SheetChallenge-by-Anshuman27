package resursionREv.permutation;

import java.util.ArrayList;
import java.util.List;

public class MColorProblem {
    public static List<Integer>[] createAdjacencyList(int[][] array) {
        List<Integer>[] adjacencyList = new List[array.length];
        for (int i = 0; i < array.length; i++) {
            adjacencyList[i] = new ArrayList<>();
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    adjacencyList[i].add(j);
                }
            }
        }
        return adjacencyList;
    }

    public static boolean graphColoring(List < Integer > [] G, int[] color, int i, int C) {
        // Your code here
        int n = G.length;
        if (solve(i, G, color, n, C) == true) return true;
        return false;
    }
    private  static  boolean solve(int node , List<Integer>[] G , int[] color , int n , int m ) {
        if (node == n) {
            return true;
        }
        for (int i = 0; i <= m; i++) {
            if (issafe(node, G, color, n, i)) {
                color[node] = i;
                if (solve(node + 1, G, color, n, m) == true) return true;
                color[node] = 0;
            }

        }
        return  false ;
    }


    private static boolean issafe(int node, List<Integer>[] G, int[] color, int n, int col) {
        for (int it : G[node]){
            if (color[it] == col) return  false ;

        }
        return  true ;
    }
}
