package stack;




import java.util.Stack;

public class MaxMInForEveyWindow {
        public static int[] maxMinWindow(int[] arr, int n)
        {
            // Definition: answer[i] will store the maximum of minimum of every window of size 'i'.
            int[] answer = new int[n];

            for (int i = 0; i < n; ++i)
            {
                answer[i] = Integer.MIN_VALUE;
            }

            // Definition: next[i] will store the index of next smaller element which lie on the right hand side of 'i'.
            int[] next = nextSmaller(arr, n);

            // Definition: prev[i] will store the index of previous smaller element which lie on the left hand side of 'i'.
            int[] prev = previousSmaller(arr, n);

            for (int i = 0; i < n; i++)
            {
                // Length of the window in which a[i] is minimum
                int length = next[i] - prev[i] - 1;

                // Update the answer[length-1] ( 0 based indexing )  with a[i]
                answer[length - 1] = Math.max(answer[length - 1], arr[i]);
            }

            // Some entries in answer[] may not be filled yet.
            // We fill them by taking maximum element from suffix starting from 'i'.
            for (int i = n - 2; i >= 0; i--)
            {
                answer[i] = Math.max(answer[i], answer[i + 1]);
            }

            return answer;
        }

        // This function will return an array.
        // Each ith position contains the index of previous smaller elements in the original array.
        private static int[] previousSmaller(int[] arr, int n)
        {
            int[] prev = new int[n];
            Stack<Integer> s = new Stack<>();

            for (int i = 0; i < n; i++)
            {
                while (!s.empty() && arr[s.peek()] >= arr[i])
                {
                    s.pop();
                }

                if (s.empty())
                {
                    prev[i] = -1;
                }
                else
                {
                    prev[i] = s.peek();
                }

                s.push(i);
            }

            return prev;
        }

        // This function will return an array.
        // Each ith position contains the index of next smaller elements in the original array.
        private static int[] nextSmaller(int[] arr, int n)
        {
            Stack<Integer> s = new Stack<>();
            int[] next = new int[n];

            for (int i = n - 1; i >= 0; i--)
            {
                while (!s.isEmpty() && arr[s.peek()] >= arr[i])
                {
                    s.pop();
                }

                if (s.empty())
                {
                    next[i] = n;
                }
                else
                {
                    next[i] = s.peek();
                }

                s.push(i);
            }

            return next;
        }

    }



