package heaps;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostFrequent_Element {
    public static int[] KMostFrequent( int[] nums , int k ) {
        
        // creat a map to store the each value with its frequency 

        Map<Integer , Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i , map.getOrDefault(i , 0 ) +1 );
        }
        // we will use min heap where value is store in accending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));
        // this will creat the min heap
        for (Integer key : map.keySet()){
            pq.add(key);
            if (pq.size() > k){
                pq.poll();
            }
        }
        // creat the output array
        int[] ans = new int[k];
        while (!pq.isEmpty()){
            ans[--k] = pq.poll();
        }
        return  ans ;
    }
}
