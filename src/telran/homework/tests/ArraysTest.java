package telran.homework.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.homework.ArraysInt;

class ArraysTest {

	private boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	@Test
	void quickSort() {
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = ArraysInt.getRandomInt(1, 1000);
		}
		ArraysInt.quickSort(array);
		assertTrue(isSorted(array));
	}

	@Test
	void bubbleSort() {
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = ArraysInt.getRandomInt(1, 1000);
		}
		ArraysInt.bubbleSort(array);
		assertTrue(isSorted(array));
	}
	
	@Test
	void binarySearch() {
		int[] array1 = {1, 2, 3, 4 ,5 ,6 ,7, 8, 9};
		int[] array2 = {1, 2, 3, 3, 3, 4, 5, 5, 6};
		assertEquals(0, ArraysInt.myBinarySearchNumber(array1, 1));
		assertEquals(4, ArraysInt.myBinarySearchNumber(array1, 5));
		assertEquals(-10, ArraysInt.myBinarySearchNumber(array1, 10));
		assertEquals(-1, ArraysInt.myBinarySearchNumber(array1, 0));
		assertEquals(2, ArraysInt.myBinarySearchNumber(array2, 3));
		assertEquals(5, ArraysInt.myBinarySearchNumber(array2, 4));
		assertEquals(6, ArraysInt.myBinarySearchNumber(array2, 5));
		assertEquals(-10, ArraysInt.myBinarySearchNumber(array2, 7));
	}
	@Test
	void muchRepeatedTest() {
		int[] array = new int[1000000];
		for (int i = 0; i < array.length; i++) {
			assertEquals(0, ArraysInt.myBinarySearchNumber(array, 0));
		}
	}
}
