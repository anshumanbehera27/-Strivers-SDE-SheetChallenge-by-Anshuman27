package String;

public class longestPalindrome {
    public String longestPalindrome(String s) {
        int len_max  = 0 ;
        String ans  = "" ;

        // here we can use the two pointer approach to find the value of it
        // we have to traverse in Both of the driction
        for (int i = 0; i < s.length(); i++) {
            // for the odd  len
            int left =  i ;
            int right =  i ;
            // check  the paticular value is the polidrom or not

            while (left>= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
              if(right - left + 1  > len_max){
                  ans = s.substring(left , right +1 ) ;
                  len_max = right - left +1  ;
              }
                left--  ;
                right++ ;

            }
            // For the even len string
            left  = i ;
            right = i + 1 ;
            while (left>= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left + 1  > len_max){ // check the length of the sting
                    ans = s.substring(left , right +1 ) ;
                    len_max = right - left +1  ;
                }
                left--  ;
                right++ ;

            }
        }
        return  ans ;

    }

    }

