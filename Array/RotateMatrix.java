package Array;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        int m = matrix[0].length ;
        // now  we have to swap the vaue i , j to j , i to transopse the value
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ;

            }
        }

        // now we have to rotate the particular row by row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <matrix.length / 2; j++) {
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[i][matrix.length-1 - j ] ;
                matrix[i][matrix.length-1 - j ] = temp ;


            }

        }

    }
}
