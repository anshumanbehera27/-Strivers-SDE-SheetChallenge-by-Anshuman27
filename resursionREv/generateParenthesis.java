package resursionREv;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public List<String> generateParenthesis(int n) {

        //  creat for the ans
        List<String> ans = new ArrayList<>() ;
        //
        StringBuilder sb = new StringBuilder("");

        creatPraenthesis(ans , n , 0 , 0 ,sb );
        return  ans ;
    }
    public void  creatPraenthesis(List<String> ans , int n , int open , int close ,StringBuilder current  ){
        // base case
        if (current.length()== n * 2 ){
            ans.add(current.toString());
            return ;
        }
        if (open < n ) creatPraenthesis(ans , n , open + 1 , close , current.append('('));
        if (close < open ) creatPraenthesis(ans , n , open , close +1 , current.append(')'));




    }
    // optimized one


        public List<String> generateParenthesis1(int n) {
            List<String> res = new ArrayList<>();

            if (n == 0) {
                return res;
            }

            backtrack(n, n, new String(), res);
            return res;
        }

        private void backtrack(int left, int right, String track, List<String> res) {
            // if right parentheses is greater than left
            if (right < left) {
                return;
            }
            // if both are less than 0
            if (left < 0 || right < 0) {
                return;
            }
            // when they are all used(left with 0)
            if (left == 0 && right == 0) {
                res.add(track);
                return;
            }

            //choose to put a left
            backtrack(left - 1, right, track + "(", res);
            //choose to put a right
            backtrack(left, right - 1, track + ")", res);
        }
    }


