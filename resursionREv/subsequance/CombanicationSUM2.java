package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombanicationSUM2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);
        findCombanaction(0, candidates, target, new ArrayList<>(), ans);

        return ans;

    }

    public static void findCombanaction(int ind, int[] arr, int target, ArrayList<Integer> ds, List<List<Integer>> ans) {
        // base case

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i<arr.length;i++){
        if (i > ind && arr[i] == arr[i - 1]) continue; // so we are able to avoid the duplicate element
        if (arr[i] > target) break;

        ds.add(arr[i]);
        findCombanaction(i + 1, arr, target - arr[i], ds, ans);
        ds.remove(ds.size() - 1);


    }
}

    }

