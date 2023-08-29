package Array;

import java.util.ArrayList;
import java.util.List;

public class Combanation {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>() ;

        find_combo(res ,new ArrayList<Integer>() ,  1 , n , k );

        return res ;



    }
    public static void  find_combo(List<List<Integer>>res , List<Integer> ds  , int start , int end , int k ){

        if (k == 0 ){
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = start; i <= end ; i++) {
            ds.add(i) ;
            find_combo(res , ds , i+1 , end , k -1);
            ds.remove(ds.size() -1 ) ;
        }
    }
}
