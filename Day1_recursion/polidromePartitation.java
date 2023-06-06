package resursionREv.subsequance;

import java.util.ArrayList;
import java.util.List;

public class polidromePartitation {
    public static List<List<String>> partition(String s) {
        // creat 2d array for store the result
        List<List<String>> res = new ArrayList<>();
        // creat a path to store the substring
        List<String> path = new ArrayList<>();
        findPartition(0 , s , path , res);
        return res;


    }
    public static  void findPartition(int ind , String s , List<String> path , List<List<String>> res){
        // base case
        // wehen ever the pointer is reach the end we have know then every substring have polidrome
        if (ind == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        // we have to partation in the every substring s
        for (int i =ind ; i < s.length() ; i++) {
            if (ispolidrom(s, ind , i)){
                path.add(s.substring(ind , i +1));
                // call the path we have to pick
                findPartition(i+1 , s , path , res);
                path.remove(path.size() -1);
            }

        }
    }
    public static boolean ispolidrom(String s , int start , int end ){
        while (start <= end){
            if (s.charAt(start++) !=  s.charAt(end--)){
                return false;
            }

        }
        return true;
    }
}
