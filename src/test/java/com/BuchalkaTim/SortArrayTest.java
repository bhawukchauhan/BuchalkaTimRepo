package com.BuchalkaTim;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArrayTest {
	@Test
	public void f() {
		int[] arr = { 106, 26, 81, 5, 15, 30, 35, 23, 70 };
		System.out.println("array : " + Arrays.toString(arr));

		for (int j = 0; j <= arr.length - 1; j++) {
			boolean allSorted = true;
			for (int i = 0; i < arr.length; i++) {
				// System.out.println("element : " + arr[i]);
				// while (i <= arr.length - 1)
				if (i < arr.length - 1)
					if (arr[i] > arr[i + 1]) {
						allSorted = false;
						// System.out.println(arr[i] + " is bigger than " + arr[i + 1]);
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
			}
			System.out.println("array " + j + " : " + Arrays.toString(arr));
			System.out.println("allSorted : " + allSorted);
			if (allSorted)
				break;
		}
		int[] sortedArray = arr;
		System.out.println("sorted array : " + Arrays.toString(arr));
		System.out.println("sorted array : " + Arrays.toString(sortedArray));
	}
	
	@Test
	public void fnSortTest() {
		SortArray sortObj = new SortArray();
		int[] arr = { 106, 26, 81, 5, 15, 30, 35, 23, 70 };
		//int[] sortedArray = sortObj.sortingOfArray(arr);
		System.out.println(Arrays.toString(sortObj.sortingOfArray(arr)));
	}

}
