package string.StringEasyProblem;
public class reverseWordinAstring {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0){
            return s;
        }
        StringBuilder result = new StringBuilder();
        String[] splitWord = s.split(" ");
        for (String word:splitWord){
            StringBuilder wordSp = new StringBuilder();
            wordSp.append(word);
            wordSp.reverse();
            result.append(wordSp.toString() + " ");
        }
        result.setLength(result.length()-1);
        return result.toString();

    }



    public String reverseWords1(String s) {
        int l=0;
        int r=0;
        char a[]=s.toCharArray();
        while(l<s.length()){
            while(r<s.length() && a[r]!=' '){
                r++;
            }
            //reverse part

            //r-1 because r is pointing current at blank space
            //Let's
            //    |
            //    r
            reverse(a,l,r-1);
            l=r+1;
            r=l;
        }
        return String.valueOf(a);
    }
    public String reverse(char s[],int l,int r){
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        return String.valueOf(s);
    }

}
