package resursionREv.subsequance;

import java.util.ArrayList;

public class SubswquanceWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = 3;
        int sum = 2 ;
        ArrayList<Integer> ds  = new ArrayList<>() ;
        //sumWithK(0 , arr ,ds , sum  ,  0 );
        System.out.println(NumOfSubSequance(0 , arr , sum , 0));


    }

    public static void sumWithK(int i ,int[] arr  ,  ArrayList<Integer> ds , int sum , int s  ){
        // base case
        if (i == arr.length) {
            if (s == sum){
                System.out.println(ds);

            }
            return;
        }
        ds.add(arr[i]);
        s += arr[i];
        sumWithK(i+1 , arr , ds , sum ,s);
        ds.remove(ds.size() -1);
        s -= arr[i];
        sumWithK(i+1 , arr , ds , sum , s);
    }
    // check howmany number of subsequance is possiable
    public static int NumOfSubSequance(int i  , int[] arr , int s  , int sum){

        // base case
        if (i == arr.length){
            if (s == sum) return  1 ;
            else  return  0 ;

        }

        s += arr[i];
        int left = NumOfSubSequance(i +1 , arr ,s  , sum);
        s -= arr[i];

        int right = NumOfSubSequance(i +1 , arr , s , sum);


        return  right + left ;

    }
    public int perfectSum(int arr[],int n, int sum)
    {
       int ans  =  NumOfSubSequance(0 , arr , 0 , sum);

       return ans ;

    }

}
