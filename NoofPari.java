import java.util.HashMap;
import java.util.Map;

public class NoofPari {
    public long noOfPairs(String box[]){
        // we have to declered the map to store the piar
        Map<Integer ,Integer> map = new HashMap<>() ;
        // her we return the actual answer
        long NoOfPair = 0 ;
        for (String ch : box){
            int val = 0 ;
            for (int i = 0; i < ch.length(); i++) {
                val ^= 1 << (ch.charAt(i) -'a');
            }
            NoOfPair += map.getOrDefault(val , 0);
            for (int i = 0; i < 26; i++) {
                int target = 1<<i ;
                NoOfPair += map.getOrDefault(val^target , 0);

            }
            map.put(val , map.getOrDefault(val , 0)+1) ;



        }
        return NoOfPair ;


    }
}
