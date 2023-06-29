package resursionREv;

import java.util.ArrayList;

public class SubsequenceProblem {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 };
        int n = 3 ;
        ArrayList<Integer> ans = new ArrayList<>();
        sub_Sequance(0 , ans , arr , n);
    }
    public static  void sub_Sequance(int ind , ArrayList<Integer> ls  , int[] arr , int n ){

        if ( ind  >= n )
        {
            System.out.println(ls.get(ind -1 ));
            return;
        }

        ls.add(arr[ind] );
        sub_Sequance(ind+ 1 , ls , arr , n );
        ls.remove(arr[ind]);
        sub_Sequance(ind+1 ,ls , arr , n );


    }
}
