package LinkedList;

public class consutiveons {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(nums);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int count = 1 ;
            for(int j = i ; j < nums.length ; j++){
                if( j !=nums.length-1 &&  nums[j] == nums[j+1]){
                    count++;
                }
                if(nums[j] == 0 ){
                    i = j +1 ;
                    break ;
                }
                maxi = Math.max(count , maxi );
            }
        }
        return maxi ;

    }
}
