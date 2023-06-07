package resursionREv.permutation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        // creat a n * n 2d array to to store the chase bored
        char [][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                board[i][j]  = '.';
            }
        }
        // creat 2D data stacture to return the ans
        List<List<String>> res   = new ArrayList<>();
        int leftrow[] = new int[n];
        int UpperDigonal[]  = new int[2* n -1];
        int LowerDigonal[] = new int[2 * n -1 ];
        solve(0 , board , res , leftrow , UpperDigonal , LowerDigonal);
        return  res ;



    }
    static  void  solve(int col , char[][] board , List<List<String>> res , int[] leftrow  , int UpperDigonal[] ,int LowerDigonal[] ){
        // base case
        // when we reach to the end of the digonal we  are able to array with all of the condation
        if (col == board.length){
            res.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            // check  in every driction if we are able to place the queen or not
            if (leftrow[row] == 0 && LowerDigonal[row + col] == 0 && UpperDigonal[board.length -1 + col - row] == 0){
                board[row][col] = 'Q';
                leftrow[row] = 1;
                LowerDigonal[row+col] = 1 ;
                UpperDigonal[board.length -1 + col - row] = 1 ;
                solve(col+1 , board , res, leftrow , UpperDigonal , LowerDigonal);
                board[row][col] = '.';
                leftrow[row] = 0;
                LowerDigonal[row+col] = 0 ;
                UpperDigonal[board.length -1 + col - row] = 0 ;
            }
        }
    }

    private static List<String> construct(char[][] board) {
        List<String > res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);

        }
        return res ;


    }

}
