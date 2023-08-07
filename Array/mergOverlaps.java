package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergOverlaps {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        // this  will help  Sort the 2d array
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {

                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }
}
