package pwAssiment.Array;

public class missing_number {
    static int missingNumber(int[] nums) {
        int i = 0 ;
        // here we have to  use the algorithm cycleSort
        while (i < nums.length){
            int correct = nums[i]-1; // first we have tofind the correct index  of the elelemnt and swap it
            if (nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i ++ ;

            }
        }
        // it is not equal to the  val  is equal to the index  then i am able to find the my missing number
        for (int index = 0; index < nums.length; index++) {
            if ( nums[index]!= index){
                return index;
            }

        }
        return nums.length;

    }
    static void swap(int[] nums,int first ,int end){
        int temp = nums[first];
        nums[first] = nums[end];
        nums[end] = temp;
    }
}
