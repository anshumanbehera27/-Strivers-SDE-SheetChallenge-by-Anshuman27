package resursionREv.permutation;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>(); // use hashSet for check the duplicate elemet
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.'){
                    // check for the row and col if there is duplicate element is present or not
                    if (!seen.add("row" + i + board[i][j]) || !seen.add("column"+ j + board[i][j])){
                        return  false;
                    }
                    // check for the box if the duplicate element is present or not
                    if (!seen.add("box" + (i/3)* 3 + j/3 + board[i][j])){
                        return  false;
                    }
                }
            }
        }
        return  true ;


    }
}
