import java.util.PriorityQueue;

public class check {
    public static int minimumMagic(int n, int m, int[] price, int[] magicalPrice) {

        PriorityQueue<Integer> priQ = new PriorityQueue<>();


        int cost_price = 0;


        for (int i = 0; i < n; i++) {
            priQ.add(price[i] - magicalPrice[i]);
            cost_price += price[i];
        }


        int count = 0;

        while (cost_price> m && !priQ.isEmpty()) {
            cost_price -= priQ.poll();
            count++;
        }


        if (count <= m) {
            return count;
        } else {
            return -1;
        }
    }
}
