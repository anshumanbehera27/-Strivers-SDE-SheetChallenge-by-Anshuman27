package string;

import java.util.ArrayList;
import java.util.Arrays;

public class amazingSubstring {

    public static void main(String[] args) {



    }
    public int solve(String A) {

        // create a arraylist were is  can store all of the element
        char arr[] = {'a' , 'e' , 'i' , 'o'  , 'u' , 'A' , 'E' , 'I' , 'O' ,'U'};
        ArrayList<Character>  store = new ArrayList<>() ;
        for (char i : arr){
            store.add(i) ;
        }
        int s = 0 ;

        for (int i = 1; i < A.length(); i++) {
            char ch = A.charAt(i) ;

            if (store.contains(ch)){
                s +=  A.length() - i ;
            }

        }
        return  s % 10003 ;


    }
    /*
      ABEC
       when ever  i found any index out of  A e i o u
        we are able to make  sub arr is len - ind
        we have to add sum one by one
        // for the last case  E at the end  len - ind + 1




     */
}
