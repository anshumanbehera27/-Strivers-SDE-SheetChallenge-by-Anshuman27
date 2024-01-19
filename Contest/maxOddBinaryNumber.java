package Contest;

public class maxOddBinaryNumber {
    public static void main(String[] args) {
       String s = "0101" ;
        System.out.println(maximumOddBinaryNumber(s));
    }
    public static String maximumOddBinaryNumber(String s) {
         StringBuilder ans  = new StringBuilder(s) ;

         // create a char array

          int len  = s.length();
          int no_ofOne = 0 ;
          // count the number of 1
        for (int i = 0; i <len; i++) {
            if  (s.charAt(i) == '1') no_ofOne++;
        }

        for (int i = 0; i < len -1 ; i++) {
            if (no_ofOne > 1) {
                ans.setCharAt(i, '1');
                no_ofOne--;
            } else {
                ans.setCharAt(i, '0');
            }
        }
       // for making them odd dig we  must have to add one to the last
        ans.setCharAt(len -1 , '1');

        return ans.toString() ;
    }
}
