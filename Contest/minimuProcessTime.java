package Contest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minimuProcessTime {
    public static void main(String[] args) {
        int[] arr = {121 , 99} ;
        List<Integer> list1 = List.of(121 , 99) ;

        int[] arr2 = {287,315,293,260,333,362,69,233} ;
        List<Integer> list2  = List.of(87,315,293,260,333,362,69,233);



    }
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks){
        int n = tasks.size() ;
        int m = processorTime.size() ;
        // Sortbothof the array
       Collections.sort(processorTime);
        Collections.sort(tasks);

        int lastInd  = n-1 ;
        int ans = 0 ;
        // for find the min we have to add with small to big value
        for (int i = 0; i < m; i++) {
            int c = 0 ;
            while (c < 4){
                ans = Math.max(ans , processorTime.get(i) + tasks.get(lastInd));
                lastInd-- ;
                c++ ;

            }

        }
        return ans ;



    }





    //    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
//        int  n  = tasks.size() ;
//        Arrays.sort(tasks.toArray());
//        int maxi  = 0  ;
//        int maxi1 = 0 ;
//
//
//        for (int i = 0; i < processorTime.size(); i++) {
//            int val = processorTime.get(i);
//            for (int j = 0; j < n; j++) {
//                int mid  = tasks.size() / 2 ;
//                if (j < mid){
//                    maxi = Math.max(maxi ,val + tasks.get(i)) ;
//                }
//                if ( j > mid){
//                   maxi1 = Math.max(maxi1 , val + tasks.get(i));
//                }
//
//
//
//            }
//
//        }
//        return Math.max(maxi , maxi1) ;
//
//    }
}
