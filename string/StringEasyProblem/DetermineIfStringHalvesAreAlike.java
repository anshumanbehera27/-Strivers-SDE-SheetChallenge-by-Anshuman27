package string.StringEasyProblem;

import java.util.ArrayList;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "Uo" ;
        System.out.println(halvesAreAlike(s));

    }
    public static  boolean halvesAreAlike(String s) {
        int len = s.length() ;
        // first we have seperate the string
        StringBuilder a = new StringBuilder() ;
        StringBuilder b = new StringBuilder();
        int val = len / 2 ;
        for (int i = 0; i < len / 2  ; i++) {
            a.append(s.charAt(i));

            b.append(s.charAt(val)) ;
            val++ ;

        }
        int val1 = count(a.toString());
        int val2 = count(b.toString()) ;
        if (val1 == val2) return   true ;
        return false ;


    }
    public static int count(String a ){
        int count = 0 ;
       a =  a.toLowerCase() ;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i) ;
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch== 'u' || ch == 'o'){
               count++ ;

           }

        }
        return count ;
    }
    // todo approcach 2
    // TC - O(N)
    public boolean halvesAreAlike1(String s) {
        int x = 0 ;
        int y = 0 ;
        String volwel = "aeiouAEIOU";
        for (int i = 0; i < s.length()/2; i++) {
            String str1 = "" + s.charAt(i);
            String str2 = ""+s.charAt(s.length()/2 + i);
            if (volwel.contains(str1)){
                x++;
            }
            if (volwel.contains(str2)){
                y++;
            }


        }
        if (x == y){
            return true;
        }
        return false;


    }
}
