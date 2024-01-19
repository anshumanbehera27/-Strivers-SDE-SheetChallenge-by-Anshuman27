package string;

import java.util.ArrayList;
import java.util.List;

public class StringTOintenger {

    public static void main(String[] args) {
        String s =  "4193 with words" ;
        System.out.println(myAtoi1(s));
    }
    public static  int myAtoi(String s) {
        int num = 0 ;
        int sin =  -1 ;
        // convert the  string to charArray
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();


        for(int i = 0 ; i < 10 ; i++){
            list.add(i) ;

        }
        // itrate through the for loop
        for(int i  = 0 ; i < arr.length  ; i++){
            if(arr[i] == ' ') continue ;

            if(arr[i] == '+') sin = sin * -1 ;

            if(list.contains((int) arr[i])){
                num = num * 10 + (int) arr[i] ;

            }
            System.out.println(num);

        }
        return num ;

    }

        public static int myAtoi1(String s) {
            int n = s.length();
            int i = 0;
            int sign = 1;
            while(i<n && s.charAt(i)==' ') {
                i++;
            }
            if (i>=n) {
                return 0;
            }
            if (s.charAt(i)=='-') {
                sign = -1;
            }
            if (s.charAt(i)=='+' || s.charAt(i)=='-') {
                i++;
            }

            if (i>=n) {
                return 0;
            }
            int num = 0;
            while (i<n && s.charAt(i)>='0' && s.charAt(i)<='9') {
                // how to convert to the  char to int just  - '0'
                int x = s.charAt(i)-'0';
                //System.out.println(x);
                if (num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && x>Integer.MAX_VALUE%10)) {
                    if (sign==1) {
                        return Integer.MAX_VALUE;
                    }
                    else {
                        return Integer.MIN_VALUE;
                    }
                }
                num = num*10 + x;
                i++;
            }
            return num*sign;
        }
    }

