package string;

public class LengthOflastWord {
    public static void main(String[] args) {
        String A = " hello wrold ";
        System.out.println(lengthOfLastWord(A));
    }

    public static int lengthOfLastWord(final String A) {

        // find the len of the first word
        // how to remove the triling space in the string
        A.trim();

        String[] arr = A.split("\\s");
        return (arr.length > 0) ? arr[arr.length -1].length() :0 ;




    }
    // with out using any libarary

//    public static int lengthOfLastWord(final String A) {
//        int n = A.size();
//
//        int i = 0;
//
//        int j = n - 1;
//
//        while (A[i] ==’ ‘)
//
//        ++i;
//
//        while (A[j] ==’ ‘)
//
//            --j;
//
//        int k = 0;
//
//        while (A[j] !=" " &&j >= 0)
//
//        {
//
//            ++k;
//
//        --j;
//
//        }
//
//        return k;
//
//    }
}

