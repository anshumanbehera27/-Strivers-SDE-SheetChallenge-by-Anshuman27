package pwAssiment.Array.aasi2;

import java.util.HashSet;

public class distributeCandies {
    public int distributeCandies1(int[] candyType) {
        int n = candyType.length ;
        int type  = 1;
        int j  = 0 ;
        for (int i = 0; i < n ; i++) {
            if (candyType[j] != candyType[i]){
                type++;
                j = i ;
            }
        }
        // check if it smaller then the alice can eat then return the type of it
        if (type < n/2) return  type;

        return n/2 ;

    }
    // OPtmized the code using HashSet
    public int distributeCandies(int[] candyType) {
        int n = candyType.length ;
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            hash.add(candyType[i]);
            }

        // check if it smaller then the alice can eat then return the type of it
        if (hash.size() < n/2) return  hash.size();

        return n/2 ;

    }

}

