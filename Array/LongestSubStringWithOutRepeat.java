package Array;

import java.util.HashMap;

public class LongestSubStringWithOutRepeat {

    public int lengthOfLongestSubstring(String s) {
        // We have to creat a hashmap for storing the char and index
        HashMap<Character , Integer> map = new HashMap<>()  ;
        // We have to make the 2Pointer Approach
        int left = 0 ;
        int right  = 0 ;
        int n = s.length() ;
        int len = 0 ;
        while (right < n ){
            if (map.containsKey(s.charAt(right))){
                // if there is a char already exiest then we have  jump the left pointer to this curr point
                left = Math.max(map.get(s.charAt(right))+1 , left) ;
            }
            // add the char and its index
            map.put(s.charAt(right) , right) ;
            // calulate the len of the paticular array
          len = Math.max(len , right - left +1  ) ;
          right ++ ;

        }
        return len ;

    }
}
