package heaps;

import java.util.ArrayList;
import java.util.Collections;

public class KThSortedelement {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        // Output array.
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Traverse all the k ArrayLists.
        for (int i = 0; i < k; i++)
        {

            for (int j = 0; j < kArrays.get(i).size(); j++)
            {
                // Add the element to the output array.
                result.add(kArrays.get(i).get(j));
            }

        }

        // Sort the output array.
        Collections.sort(result);

        return result;
    }
}
