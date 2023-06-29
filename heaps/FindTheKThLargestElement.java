package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FindTheKThLargestElement {
    public static void main(String[] args) {
        int[] arr = { 3,2,1,5,6,4};
        int  k=  2;
        System.out.println(findKthLargest(arr , k ));
    }
    public static ArrayList<Integer> kthSmallLarge(int[] arr, int n, int k) {
        //Write your code here
        Arrays.stream(arr).toArray();
        ArrayList<Integer> ans  = new ArrayList<>();
 // find out the samllest element

        ans.add(findKthSamllest(arr  ,k ));
        ans.add(findKthLargest(arr , k ));
        return ans;
    }
    public static  int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // now i have to convert the array to priority queue
        for(int i : nums){
            pq.add(i);
        }
        int len = nums.length ;
        if (len == 1 ) return  nums[0];

        for (int i = 0; i < len - k ; i++) {
            pq.poll();

        }
        return  pq.poll();

    }
    public static  int findKthSamllest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // now i have to convert the array to priority queue
        for(int i : nums){
            pq.add(i);
        }
        int len = nums.length ;
        if (len == 1 ) return  nums[0];

        for (int i = 0; i < k ; i++) {
            pq.poll();

        }
        return  pq.poll();

    }
}
