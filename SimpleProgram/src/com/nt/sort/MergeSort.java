package com.nt.sort;

import java.util.Iterator;

public class MergeSort {

	public static void conquare(int[] arr, int si, int mid, int ei) {

		int merger[] = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= ei) {

			if (arr[idx1] <= arr[idx2])
				merger[x++] = arr[idx1++];
			else
				merger[x++] = arr[idx2++];

		}

		while (idx1 <= mid)
			merger[x++] = arr[idx1++];

		while (idx2 <= ei)
			merger[x++] = arr[idx2++];

		for (int i = 0, j = si; i < merger.length; i++, j++) {
			arr[j] = merger[i];

		}

	}

	public static void divide(int[] arr, int si, int ei) {

		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);

		conquare(arr, si, mid, ei);

	}

	public static void main(String[] args) {

		int[] arr = { 3, 6, 9, 2, 5, 8 };

		int n = arr.length;

		divide(arr, 0, n - 1);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}
}
