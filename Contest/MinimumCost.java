package Contest;



import java.util.*;

    public class MinimumCost {
        public static int minimumCost(int input1, int[] input2) {
            List<List<Pair>> g = new ArrayList<>(input1 + 1);

            for (int i = 0; i <= input1; i++) {
                g.add(new ArrayList<>());
            }

            for (int i = 0; i < input1; i++) {
                if (i + 1 < input1) {
                    g.get(i + 1).add(new Pair(i + 2, Math.abs(input2[i + 1] - input2[i])));
                }
                if (i + 3 < input1) {
                    g.get(i + 1).add(new Pair(i + 4, Math.abs(input2[i + 3] - input2[i])));
                }
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.first));
            List<Integer> dis = new ArrayList<>(Collections.nCopies(input1 + 1, (int) 1e18));
            pq.add(new Pair(0, 1));
            dis.set(1, 0);

            while (!pq.isEmpty()) {
                Pair cur = pq.poll();

                for (Pair it : g.get(cur.second)) {
                    if (cur.first + it.second < dis.get(it.first)) {
                        dis.set(it.first, cur.first + it.second);
                        pq.add(new Pair(dis.get(it.first), it.first));
                    }
                }
            }

            return dis.get(input1);
        }

        public static void main(String[] args) {
            int input1 = 5;
            int[] input2 = {1, 3, 6, 8, 10};
            int result = minimumCost(input1, input2);
            System.out.println(result);
        }

        static class Pair {
            int first, second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }
        }
    }


