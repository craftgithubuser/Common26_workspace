package com.ArrayQuiz;

import java.util.Scanner;
	public class DescendingOrder{

	public static void main(String[] args) {

	        int[] integers = getIntegers();

	        printArray(integers);

	        sortIntegers(integers);
		}
	 
	public static int [] getIntegers(){
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter the length of the array:");
				int number = input.nextInt();
				
	System.out.println("Great! Please enter" + " "+ number+ " "+ "integer number:");
			     int [] arr = new int[number];
			     
	      for(int i=0; i<number; i++) {
			    	 arr[i] = input.nextInt();
			     }
			       return arr;
			}
			
		public static void printArray(int[] arr){
	     System.out.print("\nYour Original array is:");
		
			 for(int i=0; i<arr.length; i++) {
			    	 System.out.print(arr[i] + " "); 
			     }  
			   }
		  // Method to print the array
		public static void sortIntegers(int[] arr) {
			 int swap;
		     for(int i=0; i<arr.length; i++)
				{
		      for(int j=i+1; j < arr.length; j++) {
						if(arr[j] > arr[i]){
						  swap = arr[i];
						  arr[i] = arr[j];
						  arr[j] = swap;
			}
			   }   }
				
				System.out.print("\nSorted array is:");
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+ " ");
				}
			}
		
		  }

