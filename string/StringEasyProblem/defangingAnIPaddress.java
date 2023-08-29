package string.StringEasyProblem;

public class defangingAnIPaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1" ;
        System.out.println(defangIPaddr(address));

    }
    public static String defangIPaddr(String address) {
        // base case
        if (address.length() ==  0) return  "" ;
        int n = address.length() ;
        // For store the  string we have to use the string builder
        StringBuilder output = new StringBuilder() ;
        for (int i = 0; i <n  ; i++) {
            char ch = address.charAt(i);
            if (ch == '.'){
                output.append("[.]");
            }
            else  output.append(ch) ;

        }
        return output.toString() ;
    }
}
