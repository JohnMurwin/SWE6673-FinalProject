package com.cict6thedition.SortingAndSearching.Q1004SortedSearchNoSize.Arrayish;

public class Listy {
	int[] array;
	
	public Listy(int[] arr) {
		array = arr.clone();
	}
	
	public int elementAt(int index) {
		if (index >= array.length) {
			return -1;
		}
		return array[index];
	}
}
