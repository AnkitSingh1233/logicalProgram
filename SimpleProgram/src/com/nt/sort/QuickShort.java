package com.nt.sort;

public class QuickShort {

	public static int partion(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {

				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;

	}

	public static void quickShort(int[] arr, int low, int high) {

		if (low <= high) {
			int pvtidx = partion(arr, low, high);

			quickShort(arr, low, pvtidx - 1);
			quickShort(arr, pvtidx + 1, high);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 6, 3, 2, 9, 5, 8 };

		int n = arr.length;
		quickShort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
