package binaryRev;

import java.util.ArrayList;

public class FindMedianIn2D {

    public static void main(String[] args) {

    }

    public static int findMedian(int[][] A, int row, int col) {

        int low  = 1;
        int high = 1000000000 ;
        int n = row ;
        int m = col;
        while (low <= high){
            int mid = (low + high) / 2 ;
            int cnt = 0 ;
            for (int i = 0; i < n; i++) {
                cnt += CountSmallerThanMid(A[i] ,mid , col);
            }
            if (cnt <= (n*m) / 2) low = mid +1 ;
            else high = mid -1 ;

            }
        return  low ;

        }
        public static int CountSmallerThanMid(int[] A , int mid , int n){
        int l = 0 ;
        int h = n-1 ;
        while (l<= h){
            int md = (l+h) /2 ;
            if (A[md] <= mid)  l = md+1 ;
            else {
                h = md -1;
            }
        }
        return l;
        }
    }
