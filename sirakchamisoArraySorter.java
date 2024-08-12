package com.quiz1java;

import java.util.Scanner;

public class ArraySorter {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);  // Get 5 integers from the user
        printArray(myIntegers);  // Print the unsorted array

        int[] sortedArray = sortIntegers(myIntegers);  // Sort the array
        printArray(sortedArray);  // Print the sorted array
    }

    // Method to read integers from the keyboard
    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values:");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        scanner.close();
        return values;
    }

    // Method to print the contents of an array
    public static void printArray(int[] array) {
        System.out.println("Array contents:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    // Method to sort the array and return a new sorted array
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Bubble sort algorithm to sort the array
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    sorted = false;
                }
            }
        } while (!sorted);

        return sortedArray;
    }
}
