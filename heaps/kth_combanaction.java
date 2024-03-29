package heaps;
import java.util.Objects;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
    class Pair {
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
        int first;
        int second;

        @Override public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair obj = (Pair)o;
            return (first == obj.first && second == obj.second);
        }

        @Override public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    class PairSum implements Comparable<PairSum> {
        public PairSum(int sum, int first, int second) {
            this.sum = sum;
            this.first = first;
            this.second = second;
        }
        int sum;
        int first;
        int second;

        @Override public int compareTo(PairSum o) {
            return Integer.compare(o.sum, sum);
        }
    }

public class kth_combanaction {
        public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k) {
            // Sorting the arrays.
            Collections.sort(a);
            Collections.sort(b);

            // Using a max-heap.
            PriorityQueue<PairSum> maxHeap = new PriorityQueue < PairSum>();

            maxHeap.add(new PairSum((a.get(n - 1) + b.get(n - 1)), n - 1, n - 1));

            // Using a set.
            HashSet<Pair>mySet = new HashSet<Pair>();
            mySet.add(new Pair(n - 1, n - 1));

            // Output array to store the K max sum combinations.
            ArrayList<Integer> result = new ArrayList<Integer>();

            while (k > 0) {
                PairSum top = maxHeap.remove();

                int sum = top.sum;
                int x = top.first;
                int y = top.second;

                // Add the sum to the output array.
                result.add(sum);

                // Check if the indices (x-1, y) are present in the set.
                if (mySet.contains(new Pair(x - 1, y)) == false && x>0) {
                    maxHeap.add(new PairSum((a.get(x - 1) + b.get(y)), x - 1, y));
                    mySet.add(new Pair(x - 1, y));
                }

                // Check if the indices (x, y-1) are present in the set.
                if (mySet.contains(new Pair(x, y - 1)) == false && y>0) {
                    maxHeap.add(new PairSum(a.get(x) + b.get(y - 1), x, y - 1));
                    mySet.add(new Pair(x, y - 1));
                }
                k -= 1;
            }
            // Return the output array.
            return result;
        }
    }

