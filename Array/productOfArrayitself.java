package Array;

public class productOfArrayitself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int prefix[]  = new int[n];
        int sufix[] = new int[n];

        // find the prefix array
        prefix[0] = 1 ;
        for (int i = 1; i < n ; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        // find the sufix array
        sufix[n-1] = 1 ;
        for (int i = n-2; i >= 0 ; i--) {
            sufix[i] = sufix[i+1] * nums[i+1];

        }
        int[] prod = new int[n] ;
        for (int i = 0; i < n; i++) {
            prod[i]   = prefix[i] * sufix[i];
        }

        return prod;
    }
}
