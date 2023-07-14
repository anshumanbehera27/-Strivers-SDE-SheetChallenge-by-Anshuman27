import java.util.Arrays;
import java.util.HashMap;

public class prem {
    static int[] getIndicesOfItemWeights1(int[] arr, int limit) {
        // len of the Array
        int n = arr.length ;
        // for res
        int[] res = new int[2] ;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n  ; j++) {
                if (arr[i] + arr[j] == limit){
                    res[0] = j ;
                    res[1] = i ;
                    return  res ;
                }
            }
        }
        return  new int[0];

    }
    public static void main(String[] args) {
        int[]arr = {4,6,10 , 15, 16};
        int[] res = getIndicesOfItemWeights(arr , 21) ;

        System.out.println(Arrays.toString(res));


    }
    static int[] getIndicesOfItemWeights(int[] arr, int limit) {
        // Create A hashMap
        HashMap<Integer , Integer> Map = new HashMap<>() ;

        // Iterate Over the Item is avabile or not
        for (int i = 0; i < arr.length; i++) {
          int val = arr[i];
          Integer nextIndex = Map.get(limit - val);
          if (nextIndex != null){
              return new int[]{i , nextIndex} ;
          }
          else Map.put(val , i );

        }
        // if we are not found the element
        return new int[]{} ;

    }


}
