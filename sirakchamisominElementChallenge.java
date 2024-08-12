package com.quiz1java;

import java.util.Scanner;

public class minElementChallenge {

    // Create a Scanner as a static field to help with data input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Read the count from the console
        System.out.print("Enter the number of integers you want to input: ");
        int count = scanner.nextInt();

        // Call the readIntegers method with the count parameter
        int[] array = readIntegers(count);

        // Call the findMin method passing the array returned from readIntegers
        int minValue = findMin(array);

        // Print the minimum element in the array
        System.out.println("The minimum value in the array is: " + minValue);
    }

    // Method to read integers from the console
    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}