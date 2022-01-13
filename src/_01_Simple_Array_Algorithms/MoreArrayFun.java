package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main (String [] args) {
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		MoreArrayFun a = new MoreArrayFun();
		a.orderedArrays(array);
		System.out.println("Next");
		a.reverseOrderedArrays(array);
		System.out.println("Next");
		a.moduloArrays(array);
		System.out.println("Next");
		a.ranArrays(array);
		}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

	void orderedArrays(String[] array) {
		for (String i: array) {
			System.out.println(i);
		}
	}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	void reverseOrderedArrays(String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	void moduloArrays(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	void ranArrays(String[] array) {
		Random ran = new Random();
		int[] indexes = new int[array.length];
		boolean moreToGo = true;
		while(moreToGo) {
			int i = ran.nextInt(array.length);
			if (indexes[i] != -1) {
				System.out.println(array[i]);
				indexes[i] = -1;
				int count = 0;
				for (int j: indexes) {
					count+=1;
					if (j != -1) {
						break;
					}
					if (count == indexes.length) {
						moreToGo = false;
					}
				}
			}
			
		}
	}

}
