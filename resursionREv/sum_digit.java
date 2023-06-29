package resursionREv;

import javax.management.StandardEmitterMBean;

public class sum_digit {
    public static void main(String[] args) {
        System.out.println(myPow(2 , 10));
        RevNum(1234467);

    }

    public static int sum(int n){
      if(n == 0 ) return  0  ;

      int sum = n + sum(n-1);

      return sum ;

    }
    public  static int sumofDig(int val){
        if (val ==0 ) return  0 ;

        int sum = (val % 10) + sumofDig(val/10 );

        return sum ;


    }
    public static void RevNum(int n ){
        if (n  == 0 ) return;
        System.out.print(n % 10 + " ");
        RevNum(n /10 );


    }
    public static double myPow(double x , int n ){
        if (n < 0 ) return  myPowx(1/ x , n );
        return myPowx(x , n );
    }

    public static  double myPowx(double x , int n ){
        // base case
        if (n == 0 ) return  1 ;
        // if the n is
        double temp = myPowx(x , n/2);
        if (n % 2 == 0){
            return  temp* temp;

        }
        // if it is odd
        else return temp * x ;
        // this will cause the stack overflow error so we can  solve by creat a new finction for it


    }


}
