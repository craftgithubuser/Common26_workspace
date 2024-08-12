package com.quiz1java;


import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        // Example array to be reversed
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Call the reverse() method
        reverse(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the middle
            start++;
            end--;
        }
    }
}