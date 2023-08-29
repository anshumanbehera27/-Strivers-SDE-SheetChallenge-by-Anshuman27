package string.StringEasyProblem;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        String s = "is2 sentence4 This1 a3" ;
//        String[] arr = s.split(" ") ;
//       // System.out.println(Arrays.toString(arr));
//        // FInd the index
//        String si = arr[0] ;
//        System.out.println(si.substring(si.length() -1 ));
//        // remove the index
//        System.out.println(si.substring(0 , si.length()-1 ));

//        String[] word1 = {"ab" , "c"} ;
//        String str = String.join("", word1) ;
//        System.out.println(str);
       String s = "textbook hello" ;

//        int len = s.length() ;
//        // first we have seperate the string
//        StringBuilder a = new StringBuilder() ;
//        StringBuilder b = new StringBuilder();
//          int val = len / 2 ;
//        for (int i = 0; i < len / 2  ; i++) {
//            a.append(s.charAt(i));
//
//            b.append(s.charAt(val)) ;
//            val++ ;
//
//        }
//        System.out.println(a);
//        System.out.println(b);

        for (String ele:s.split(" ")){
            System.out.println(ele);
        }
    }
}
