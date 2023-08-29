package string;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class valid_Anagram {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        isAnagram(s , t ) ;

    }
    public static boolean isAnagram(String s, String t) {
        // first check if the len is not same then we have to return false
        if (s.length() != t.length() ) return  false ;
        int[] check = new int[26] ;
        int[] check1 = new int[26] ;
        for (int i = 0; i < s.length(); i++) {
            check[s.charAt(i) - 'a']++ ;
            check1[t.charAt(i)  - 'a']++ ;
        }
        for (int i = 0; i < 26; i++) {
            if (check[i] != check1[i]) return  false ;


        }
        return true ;
    }

    public boolean isAnagram1(String s, String t) {
        int len = s.length() ;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i) ;
            list.add(ch)  ;

        }
        for (int i = 0; i < t.length(); i++) {
            char ele = t.charAt(i) ;
            if (!list.contains(ele)) {
                return false;

            }


        }
        return true  ;

    }
}
