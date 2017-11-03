package com.www.util;

public class SimpleSort {
	public static void main(String[] args) {
		int[] arr = {5,10,7,1,3,2};
		SimpleSort bobble = new SimpleSort();
		bobble.bobbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//冒泡排序的实现
	public void bobbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
}
