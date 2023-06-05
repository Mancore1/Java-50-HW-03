package telran.homework;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {
	public static int searchNumber(int[] array, int number) {
		int index = 0;
		while (index < array.length && array[index] != number) {
			index++;
		}
		return index < array.length ? index : -1;
	}

	public static int binarySearchNumber(int[] array, int number) {
		int left = 0;
		int right = array.length - 1;
		int middle = right / 2;
		while (left <= right && array[middle] != number) {
			if (number < array[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
			middle = (left + right) / 2;
		}
		return left <= right ? middle : -1;
	}

	public static void quickSort(int[] array) {
		Arrays.sort(array); // O[N]*LogN
	}

	public static void bubbleSort(int[] array) {
		int length = array.length;
		boolean flSorted = false;
		do {
			length--;
			flSorted = true;
			for (int i = 0; i < length; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					flSorted = false;
				}
			}
		} while (!flSorted);
	}

	private static void swap(int[] array, int i, int j) {
		// swap with no additional variable;
//			array[i] = array[i] + array[i] + 1;
//			array[i + 1] = array[i] - array[i + 1];
//			array[i] = array[i] - array[i + 1];
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static int getRandomInt(int min, int max) {
		Random gen = new Random();
		return gen.nextInt(min, max);
	}

	public static int myBinarySearchNumber(int[] array, int number) {
		int left = 0;
		int right = array.length - 1;
		int index = -1;
		
		while (left <= right) {
			int middle = (left + right) / 2;
			
			if (array[middle] == number) {
				index = middle;
				right = middle - 1;
			} else if (number < array[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
	}
		return index >= 0 ? index : -(left+1);
}
}
