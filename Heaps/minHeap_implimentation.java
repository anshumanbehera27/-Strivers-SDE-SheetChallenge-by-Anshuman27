package heaps;

public class minHeap_implimentation {
    static int[] H = new  int[50];
    static  int size  = -1  ;

    static int parents(int i){
        return (i-1)/2;
    }
    static  int leftnode(int i ){
        return (2*i) + 1 ;

    }
    static int rightnode( int i ){
        return (2* i) + 2 ;

    }

    // shiftup
    static void shiftup(int i ){
        while (i > 0 && H[parents(i)] < H[i]){
            swap(parents(i), i);
            // udate the node to its parent node
            i = parents(i);

        }

    }
    //shiftdown
    static void  shifdown (int i ){
        int maxIndex = i ;
        int l = leftnode(i);
        if (l <= size && H[l] > H[maxIndex]){
            maxIndex = l;
        }
        // right index
        int r = rightnode(i);
        if (r <= size && H[r]  > H[maxIndex]){
            maxIndex  = r;
        }
        // if it is not same
        if (i != maxIndex){
            swap(i , maxIndex);
            shifdown(maxIndex);
        }
    }
    // inserThelement
    static void  insert(int p ){
        size = size +1 ;
        H[size] = p ;
        // shift up to mantain the priority
        shiftup(size);
    }

    // extracet the max remove the max element and place every paticular position accoring to priority
    static int extracetMax(){
        int result = H[0];

        H[0] = H[size];
        size = size - 1 ;

        shifdown(0);
        // Shift down the replaced
        // element to maintain the
        // heap property
        return  result;
    }
    static int extractMin(){
        if (size == 0 ) return  Integer.MAX_VALUE;

        if (size == 1 ) {
            size--;
            return H[0];
        }


        swap(H[0],H[size -1 ]);
        size-- ;
        Minheapify(0);
        return H[size];


    }

    static  void  chnagePriority (int i , int p ) {
        int oldp = H[i];
        H[i] = p ;
        if (p > oldp) {
            shiftup(i);
        }
        else {
            shifdown(i);
        }


    }

    static  int getmax(){
        return H[0];
    }
    static  void  remove(int i){
        H[i] = getmax() + 1 ;
        //shiftup Node to root

        shiftup(i);

        // extract the node
        extracetMax();

    }
    static void swap(int i , int j ){
        int temp = H[i];
        H[i] = H[j];
        H[j] = temp;

    }
    static  void Minheapify(int i ) {
        int li = leftnode(i);
        int ri = rightnode(i);
        int smallest = i;
        if (li < size && H[li] < H[smallest]) {
            smallest = li;
        }
        if (ri < size && H[ri] < H[smallest]) { // check right and left element is present or not by checking the size

            smallest = ri;
        }
        // now we can find the  min out of 3

        // now arrange in the same position
        if (smallest != i) {
            swap(H[i], H[smallest]);

            Minheapify(smallest);
        }
    }
    static  void maxheapify(int i ) {
        int li = leftnode(i);
        int ri = rightnode(i);
        int largest = i;
        if (li < size && H[li] > H[largest]) {
            largest = li;
        }
        if (ri < size && H[ri] >H[largest]) { // check right and left element is present or not by checking the size

            largest = ri;
        }
        // now we can find the  max out of 3

        // now arrange in the same position
        if (largest != i) {
            swap(H[i], H[largest]);

            maxheapify(largest);
        }
    }
    void decreaseKey(int i , int x){
        // first replace the element with  the paticular Index
        H[i] = x ;
        //  make the heps as min heap after the replace the element
        while (i != 0 && H[parents(i)] > H[i]){
            swap(H[i] , H[parents(i)]);
            i = parents(i);
        }
    }

    // Delete a key
    // first function is  Decrese
    // TODO : Deletekey
    // here we will use extract min and decrese min

    void  deleteELement(int i , int key){
        // first we have to replce the paticular element with the infinity
        decreaseKey(i , Integer.MIN_VALUE);
        // now we have to arrange in the min heap from
        // so we wil use the extract min function
        extractMin();
    }








    public static void main(String[] args)
    {

  /*           45
            /        \
           31      14
          /  \    /  \
         13  20  7   11
        /  \
       12   7
    Create a priority queue shown in
    example in a binary max heap form.
    Queue will be represented in the
    form of array as:
    45 31 14 13 20 7 11 12 7 */

        // Insert the element to the
        // priority queue
        insert(45);
        insert(20);
        insert(14);
        insert(12);
        insert(31);
        insert(7);
        insert(11);
        insert(13);
        insert(7);

        int i = 0;

        // Priority queue before extracting max
        System.out.print("Priority Queue : ");
        while (i <= size)
        {
            System.out.print(H[i] + " ");
            i++;
        }

        System.out.print("\n");

        // Node with maximum priority
        System.out.print("Node with maximum priority : " +
                extracetMax() + "\n");

        // Priority queue after extracting max
        System.out.print("Priority queue after " +
                "extracting maximum : ");
        int j = 0;
        while (j <= size)
        {
            System.out.print(H[j] + " ");
            j++;
        }

        System.out.print("\n");

        // Change the priority of element
        // present at index 2 to 49
        chnagePriority(2, 49);
        System.out.print("Priority queue after " +
                "priority change : ");
        int k = 0;
        while (k <= size)
        {
            System.out.print(H[k] + " ");
            k++;
        }

        System.out.print("\n");

        // Remove element at index 3
        remove(3);
        System.out.print("Priority queue after " +
                "removing the element : ");
        int l = 0;
        while (l <= size)
        {
            System.out.print(H[l] + " ");
            l++;
        }
    }


}
