package heaps;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.PriorityQueue;

public class MergKSortedArray {
    static class Pair
    {
        public int first, second, third;

        Pair(int first, int second, int third)
        {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }


    // Implements Comparator interface for min-heap.
  static   class PqComparator implements Comparator<Pair>
    {
        public int compare(Pair pair1, Pair pair2)
        {
            if (pair1.first < pair2.first)
            {
                return -1;
            }
            if (pair1.first == pair2.first)
            {
                return 0;
            }
            return 1;
        }
    }



        public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
        {
            ArrayList<Integer> result = new ArrayList<Integer>();

            // Create a min heap to store atmost k heap nodes at a time.
            PriorityQueue<Pair> minHeap = new PriorityQueue < Pair>(new PqComparator());

            for (int i = 0; i < kArrays.size(); i++)
            {
                minHeap.add(new Pair( kArrays.get(i).get(0), i, 0 ));
            }


            while (minHeap.isEmpty() == false)
            {

                // Remove the minimum element from the heap.
                Pair curr = minHeap.remove();

                // i is the array number and j is the index of the removed element in the ith array.
                int i = curr.second;
                int j = curr.third;

                // Add the removed element to the output array.
                result.add(curr.first);

                // If the next element of the extracted element exists, add it to the heap.
                if (j + 1 < kArrays.get(i).size())
                {
                    minHeap.add(new Pair( kArrays.get(i).get(j + 1),  i, j + 1 ));
                }
            }

            // Return the output array.
            return result;
        }
    }

