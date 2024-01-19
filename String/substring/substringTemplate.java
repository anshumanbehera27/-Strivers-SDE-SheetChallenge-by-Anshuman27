package string.substring;

public class substringTemplate {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ;
        int end = 0 ;
        int maxlength = 0 ;
        int counter = 0 ;
        int[] map = new int[128];

        while (end <s.length()){
            final  char c1 = s.charAt(end);
            if (map[c1] >0) counter++;

            map[c1]++;
            end++;

            while (counter >0){
                char c2 = s.charAt(start);
                if (map[c2] > 1) counter--;
                map[c2]--;
                start++;
            }
            maxlength = Math.max(maxlength , end - start);
        }

        return maxlength ;
    }
}
