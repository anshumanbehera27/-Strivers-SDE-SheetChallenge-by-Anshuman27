package pwAssiment.Array.Array2d;

import java.util.ArrayList;

public class InsterinArray {
    static ArrayList<Integer> findCommon(int[] arr1 , int[] arr2 ,int[] arr3){
        // find the length of the 3 array
        ArrayList<Integer> ans  = new ArrayList<>();
        int n1 = arr1.length ;
        int n2  = arr2.length ;
        int n3 = arr3.length ;
        // define  3 pointer for the elelemt
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while (i < n1 && j < n2 && k < n3){

            // we have to check that the initinal Part is Equal
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                ans.add(arr1[i]) ;

            }
            else if (arr1[i] < arr2[j]) i++ ;
            else if (arr2[j] < arr3[k]) j++ ;
            else k++ ;
        }
        return ans;
    }

}
