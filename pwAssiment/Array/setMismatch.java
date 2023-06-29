package pwAssiment.Array;

public class setMismatch {
    public static void main(String[] args) {



    }
    public int[] findErrorNums(int[] nums) {
        int i =0 ;
        // here the range is from 1 to n so we will use Cyccle SOrt

        while (i < nums.length){

            int corrct = nums[i] -1 ;
            if (nums[i] != nums[corrct]){
                swap(nums , i , corrct);
            }
            else i++ ;
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                return  new int[]{nums[index] , index+1} ;
            }

        }
        return new int[]{-1 ,-1 };

    }
    static void swap(int[] arr  , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;

    }
}
