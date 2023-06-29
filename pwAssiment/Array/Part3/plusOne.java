package pwAssiment.Array.Part3;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // Starting from the least significant digit (i.e., the last element of the array)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can add 1 to it and return the updated array
            if (digits[i] < 9) {
                digits[i]++; // Add 1 to the current digit
                return digits; // Return the updated array
            }
            // If the current digit is 9, we set it to 0 and continue with the next digit
            else {
                digits[i] = 0; // Set the current digit to 0
            }
        }
        // If we reach here, it means all digits were 9, so we need to create a new array with one more element
        int[] result = new int[n + 1]; // Create a new array with length n + 1
        result[0] = 1; // Set the first element to 1, since all other elements are 0 by default
        return result; // Return the new array
    }
}
