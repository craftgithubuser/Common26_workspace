package com.ArrayQuiz;
import java.util.Scanner;

public class ReverseArrayChallenge{
	
		    public static int[] readIntegers(int count) {
		        Scanner s = new Scanner(System.in);
		        int[] a = new int[count];
	System.out.println("Greate! Please Enter " + count + " integers:");

		        for (int i = 0; i < count; i++) {
		            a[i] = s.nextInt();
		        }
		        return a;
		    }

		    public static int findMin(int[] a) {
		    	int min = a[0];
		        for (int i = 0; i < a.length; i++) {
		            if (min > a[i]) {
		                min = a[i];
		            }
		        }
		        return min;
		    }
		    
	public static void main(String[] args) {
		        
		    	Scanner s = new Scanner(System.in);
		    	System.out.println("How many number you want to enter:");
		    		        int count = s.nextInt();

		    		     // Get the array of integers
		    		        int[] integers = readIntegers(count);
		    		        
		    		        int min = findMin(integers);
		    	System.out.println("The minimum number is: " + min);
		    }
		}
