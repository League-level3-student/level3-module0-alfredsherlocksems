package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] names = new String[5];
    	names[0] = "Bob";
    	names[1] = "Andy";
    	names[2] = "Rob";
    	names[3] = "Sam";
    	names[4] = "Sally";
        // 2. print the third element in the array
    	System.out.println(names[2]);
        // 3. set the third element to a different value
    	names[2] = "Kate";
        // 4. print the third element again
    	System.out.println(names[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < names.length; i++) {
    		names[i] = "James";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < names.length; i++) {
    		System.out.println(names[i]);
    	}
        // 7. make an array of 50 integers
    	int[] numList = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	for (int i = 0; i < numList.length; i++) {
    		numList[i] = ran.nextInt(101);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smallestNum = numList[0];
    	for (Integer i: numList) {
    		if (smallestNum > i) {
    			smallestNum = i;
    		}
    	}
    	System.out.println("smallestNumber = " + smallestNum);
        // 10 print the entire array to see if step 8 was correct
    	for  (Integer i: numList) {
    		System.out.println(i);
    	}
        // 11. print the largest number in the array.
    	int largestNumber = numList[0];
    	for (Integer i: numList) {
    		if (largestNumber < i) {
    			largestNumber = i;
    		}
    	}
    	System.out.println("largestNumber = " + largestNumber);
        // 12. print only the last element in the array
    	System.out.println(numList[49]);
    }
}
