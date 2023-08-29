package string;

public class pattrenMatchingAlgo {
    public int strStr(String haystack, String needle) {
            int h = haystack.length();
            int n = needle.length();
            if(n == 0){
                return 0;
            }
            for (int i = 0; i < h; i++) {
                if (haystack.charAt(i) == needle.charAt(0)){
                    if (n>1){
                        if (h-i>= n ){
                            for (int j = 1; j < n; j++) {
                                if (haystack.charAt(i + j) != needle.charAt(j)){
                                    break;

                                }
                                if (j == n-1 ){
                                    return i;
                                }


                            }


                        }

                    }
                    else {
                        return i;
                    }
                }


            }
            return -1;

        }
    }
//    public int strStr(String haystack, String needle) {
//
//        if (haystack.length() == 0) return  -1 ;
//
//        int len = haystack.length() ;
//        boolean flag = true ;
//        int index = 0  ;
//
//        for (int i = 0; i <len; i++) {
//            int val = i ;
//            for (int j = 0; j < needle.length(); j++) {
//
//                if (haystack.charAt(val) != needle.charAt(j)) {
//                    flag = false ;
//                    break;
//                   // index = val ;
//                    }
//                val++ ;
//            }
//        }
//        return index  ;
//}

