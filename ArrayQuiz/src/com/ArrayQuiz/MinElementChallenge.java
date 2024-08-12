package com.ArrayQuiz;
   
public class MinElementChallenge{

	 public static void reverse(int[] num, int first, int last) {

		        int swap;
		        while (first < last) 
		        {
		            swap = num[first];
		            num[first] = num[last];
		            num[last] = swap;

		            first++;
		            last--;
		        }    
		    }

	public static void printArray(int[] num) {
		 for (int i=0; i< num.length; i++) {
		 System.out.print(num[i] + " ");
		        }
		    }
		    
	 public static void main(String[] args) {
	     int[] num = {1, 2, 3, 4, 5};
	    	System.out.print("Original array:");
	    	printArray(num);
		       
		        reverse(num, 0, num.length-1);
	 System.out.print("\nReversed array:");
		        printArray(num);
		    } 
	 }
