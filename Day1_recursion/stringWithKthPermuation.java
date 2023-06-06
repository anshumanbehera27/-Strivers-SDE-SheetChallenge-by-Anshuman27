package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.List;

public class stringWithKthPermuation {
    public static String kthPermutation(int n, int k) {
        int fact = 1 ;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact *i ;

            numbers.add(i);
        }
        numbers.add(n);
        String  ans = "";
        k = k -1 ; // for zero based indexcing
        while (true){
            ans  = ans + numbers.get(k / fact);
            numbers.remove(k/fact);
            if (numbers.size() == 0){
                break;
            }
            k = k% fact ;
            fact = fact / numbers.size();

        }
        return ans;
    }
}
