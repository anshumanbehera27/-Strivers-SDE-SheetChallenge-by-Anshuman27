package binaryRev;

import java.util.ArrayList;
import java.util.Collections;

public class FindMedianBroutForce
{
    // broutForce Approch
    /*
    Time Complexity : O(N * M * log(N * M))
    Space Complexity : O(N * M)

    Where 'N' is the number of rows
    and 'M' is the number of columns in the given matrix.
*/
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
    {

        int n = matrix.size();
        int m = matrix.get(0).size();

        // ArrayList to store the elements in given matrix.
        ArrayList<Integer> data = new ArrayList<Integer>();

        // Iterate through matrix and push elements in the vector.
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                data.add(matrix.get(i).get(j));
            }
        }

        // Sort the vector of elements in non-decreasing order.
        Collections.sort(data);

        // Return the median which is (N*M)/2 th element in the vector.
        return data.get((n * m) / 2);
    }
}

