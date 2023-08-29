package String;

public class LargestOddIntheString {
    public static void main(String[] args) {
        String num = "35427" ;
        System.out.println(num);
    }
    public static String largestOddNumber(String num) {
        int n = num.length() -1 ;
        // if the last dig is odd then all the dig is odd
        if(num.charAt(n) % 2 == 1 ) return  num ;
        int  i = n ;
        while (i >=  0 ) {
            if (num.charAt(i) % 2 == 1) break;
            i--;
        }
        return num.substring(0 , i +1 ) ;
    }
}
