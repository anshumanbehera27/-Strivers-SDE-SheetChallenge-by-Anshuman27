package resursionREv.subsequance;

import java.util.ArrayList;

public class CombanicationSum1 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }


        int target = 7;
        System.out.println(findSubsetsThatSumToK(ans , ans.size() , target));

    }
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k)
    {
        // creat a 3d array to store the element
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();

        findtheCombaction(0 , arr , n , k , ds , ans);
        return ans ;


    }
    public static void findtheCombaction(int ind  ,ArrayList<Integer> arr , int n , int target ,  ArrayList<Integer> ds , ArrayList<ArrayList<Integer>> ans){

        // base case
        if (ind == arr.size()){
            if (target == 0 && ds.size() != 0){
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        if (arr.get(ind) <= target){
            ds.add(arr.get(ind));
            findtheCombaction(ind , arr , n , target - arr.get(ind) , ds , ans);
            ds.remove(ds.size() -1 );

        }
        findtheCombaction(ind +1 , arr , n , target , ds , ans);

    }
}
