import java.util.PriorityQueue;

public class MagicAndToyShop {

    public int minimumMagic(int n, int m, int price[], int magical_price[]){
        // here we will use the pripoity queue
        PriorityQueue<Integer> quqeue = new PriorityQueue<>() ;
        int cost  = 0  ;
        // we have to  Iterate through the prices and magical prices and add the difference to the queue.

        for (int i = 0; i < n; i++) {
            quqeue.add(price[i]- magical_price[i]);
            cost += price[i];
        }
        int cnt = 0 ;
        while (cost > m && quqeue.size() >0){
            cost -= quqeue.peek() ;
            quqeue.poll() ;
            cnt++ ;
        }
        if (cnt<= m) return  cnt ;
        else return  -1 ;

    }
}
