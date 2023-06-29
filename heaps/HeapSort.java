package heaps;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        heapsort(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }
    static int parents(int i){
        return (i-1)/2;
    }
    static  int leftnode(int i ){
        return (2*i) + 1 ;

    }
    static int rightnode( int i ){
        return (2* i) + 2 ;

    }
    // TODO 1 - swap the node
    static  void  swap(int a , int  b ){
        int temp = a ;
        a = b ;
        b = temp ;
    }
    static  void  heapsort(int[] arr, int n  ) {
        // 1step is to bulid the heap
        bulidheap(arr, n);
         // here we have to skipe the one element so it will soprt the every element

        for (int i = n-1; i >= 1 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxheapify(arr,n,0);


        }



    }
    // TODO 2 - Build heap
    static  void  bulidheap(int[] arr  , int n ){
        for (int i = (n/ 2) -1 ; i >= 0 ; i--) {
            maxheapify(arr,n,i);

        }
    }
    // TODO maxheapify
    static  void maxheapify(int [] arr , int n , int i ) {
        int li = leftnode(i);
        int ri = rightnode(i);
        int largest = i;
        if (li < arr.length && arr[li] > arr[largest]) {
            largest = li;
        }
        if (ri < arr.length && arr[ri] >arr[largest]) { // check right and left element is present or not by checking the size

            largest = ri;
        }
        // now we can find the  max out of 3

        // now arrange in the same position
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;


            maxheapify(arr,n,largest);
        }
    }
 // TODO min heapify
    static  void Minheapify(int[] H, int size ,int i ) {
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

            Minheapify(H,size,smallest);
        }
    }

}
