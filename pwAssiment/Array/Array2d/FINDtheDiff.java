package pwAssiment.Array.Array2d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FINDtheDiff {
    public List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
        List<List<Integer>> ans =  new ArrayList<>() ;

        ans.add(checkdiff(nums1 , nums2));
        ans.add(checkdiff(nums2 , nums1));

        return ans ;
    }
    static ArrayList<Integer> checkdiff(int[] nums1 , int[] nums2){

        ArrayList<Integer> arr = new ArrayList<>() ;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            arr.add(nums2[i]);

        }
        for (int i = 0; i < nums1.length; i++) {
            if (!arr.contains(nums1[i])){
                ans.add(nums1[i]);

            }

        }
        return ans ;
}
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>() ;
        HashSet<Integer> set2 = new HashSet<>();
        for (int ele :nums1){
            set1.add(ele);
        }
        for (int ele : nums2){
            set2.add(ele);
        }
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>() ;
        for (int ele : set2){
            if (!set1.contains(ele)) l1.add(ele);
        }
        for (int ele :set1){
            if (!set2.contains(ele) ) l2.add(ele);
        }
        list.add(l2);
        list.add(l1);
        return  list ;


    }

}
