package string;

public class Reapeated_String_match {

   public static int repeatedStringMatch(String a, String b) {

            if(a.equals(b)){
                return 1;
            }
            int count = 1;
            String source = a;

            while(source.length() < b.length()){
                count++;
                source+=a;

            }

            if(source == b) return count;

            if(rabin(source , b) ){
                return count;
            }
            if(rabin(source+a , b)){
                return count+1;
            }
            return -1;




        }
        public static boolean rabin(String a, String b){


            long p = 31;
            long pow = 31;
            long mod = 1000000007;
            long hashcode = (b.charAt(0) - 'a' +1);


            for(int i = 1 ; i< b.length() ; i++){
                hashcode = (hashcode+ ((b.charAt(i) - 'a' +1)*pow)) %mod;
                pow  = (pow*p)%mod;
            }

            long[] dp = new long[a.length()];
                long[] pd = new long[a.length()];

                dp[0] = (a.charAt(0)-'a' +1);
                pd[0] = 1;
                pow = p;
                for(int i = 1 ; i<a.length() ; i++){
                dp[i] = (dp[i-1] + ((a.charAt(i)-'a'+1)*pow))%mod;
                pd[i] = pow;
                pow = (pow*p)%mod;


            }

            int sp = 0 , ep = b.length()-1;
            while(ep< a.length() ){
                long win = dp[ep];
                if(sp>0) win = (win -dp[sp-1] + mod)%mod;
                if(win == (hashcode*pd[sp])%mod) return true;
                ep++;
                sp++;
            }

            return false;





        }
    }

