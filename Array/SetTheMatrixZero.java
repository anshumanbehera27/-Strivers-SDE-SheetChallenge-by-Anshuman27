package Array;

public class SetTheMatrixZero {
    public void setZeroes(int[][] matrix) {
        // find the len of the row and col
        int col0 = 1 ;
        int row = matrix.length ;
        int col = matrix[0].length;

        //set the 2 dummy array at the edge of the array one is row and one is col
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) col0 = 0 ;
            for (int j = 1; j < col; j++) {
                // when every found the any elelment zero then i  will set the both elelemt to Zero
                if (matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0 ;
                }
            }
        }
        // now we have to traverse all the row and col and set it to Zero
        for (int i = row -1 ; i >= 0; i--) {
            for (int j = col-1; j >= 0 ; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0 ;
                }

            }
            if (col0 == 0 ) matrix[i][0] = 0 ;

        }

    }
}
