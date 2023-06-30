package pwAssiment.Array.TwoDArray;

public class Convert1DTo2D {
    public static void main(String[] args) {
        int[] arr = {1,2};
        construct2DArray(arr ,1 ,1);
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length ;
        int ind = 0 ;
        int[][] ans = new int[m][n];
       if (len != n*m) return  new int[0][0] ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ind < len)
                 ans[i][j] = original[ind];
                 ind++ ;

            }
        }
        return ans ;



    }
}
