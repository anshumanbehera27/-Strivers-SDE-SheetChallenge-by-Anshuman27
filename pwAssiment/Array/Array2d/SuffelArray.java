package pwAssiment.Array.Array2d;

public class SuffelArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[n+n];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            ans[k+1]=nums[n+i];
            k+=2;
        }

        return ans;
    }
}
