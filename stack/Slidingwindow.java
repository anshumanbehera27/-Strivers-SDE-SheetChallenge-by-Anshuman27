package stack;

import java.util.*;

public class Slidingwindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // first find the length of the arr
        int n = nums.length ;
        // we have to creat a array where we can store the max element of the Window
        int ans[] = new int[n-k +1 ];
        // define a pointer for the array
        int r = 0 ;
        // Creat A deque for
        // here we can store the index from the both of theside
        Deque<Integer> q =  new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            /*
            * first condation - we have to make the k size window
            * so we have to remove All the elelment which is out of range of the paticular window
            * so we have to remove the privious elelement only for this case
            * condation is if Q.peek == i - k  then we have to remove the  index from queue
             */
            if (!q.isEmpty() && q.peek() == i - k) q.pop() ;

            /*
            * 2nd condation - now we have to find the max element in the window
            * we have to remove all the smallest element from the paticular Window
            * condatin if arr at index 1.peeklast  < a[i] then  we have to remove the peeklast
             */
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast() ;
            }
            // now we have to add the index to the queue
            q.offer(i) ;
            // if my window size is full then i  am able to insert the element to the ans array
            if (i >= k-1 ){
                ans[r++] = nums[q.peek()];
            }


        }
        return ans  ;
    }

    public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k)
    {
        // first find the length of the arr
        int n = nums.size() ;
        // we have to creat a array where we can store the max element of the Window
        ArrayList<Integer> ans= new ArrayList<>();
        // define a pointer for the array
        int r = 0 ;
        // Creat A deque for
        // here we can store the index from the both of theside
        Deque<Integer> q =  new ArrayDeque<>();
        for (int i = 0; i < nums.size(); i++) {
            /*
             * first condation - we have to make the k size window
             * so we have to remove All the elelment which is out of range of the paticular window
             * so we have to remove the privious elelement only for this case
             * condation is if Q.peek == i - k  then we have to remove the  index from queue
             */
            if (!q.isEmpty() && q.peek() == i - k) q.pop() ;

            /*
             * 2nd condation - now we have to find the max element in the window
             * we have to remove all the smallest element from the paticular Window
             * condatin if arr at index 1.peeklast  < a[i] then  we have to remove the peeklast
             */
            while (!q.isEmpty() && nums.get(q.peekLast())< nums.get(i)){
                q.pollLast() ;
            }
            // now we have to add the index to the queue
            q.offer(i) ;
            // if my window size is full then i  am able to insert the element to the ans array
            if (i >= k-1 ){
              ans.add(nums.get(q.peek()));
            }
        }

        return ans  ;
    }




    }

