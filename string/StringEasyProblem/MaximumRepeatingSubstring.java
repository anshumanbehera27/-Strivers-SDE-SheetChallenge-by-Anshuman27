package string.StringEasyProblem;

public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        // Check for the base case
        if (word.length() > sequence.length())  return  0 ;
        int ans = 0 ;

        // Create a String Builder
        StringBuilder sb = new StringBuilder() ;
        while (sb.length() <= sequence.length()){
            sb.append(word) ;
            // String must be in the consituve manner
            if (sequence.contains(sb)) ans++ ;
            else break;
        }
        return ans ;


    }
}
