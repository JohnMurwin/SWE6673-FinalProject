package com.cict6thedition.SortingAndSearching.Q1002GroupAnagrams;

import java.util.Arrays;

import com.cict6thedition.CtCILibrary.AssortedMethods;

public class Question {
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		System.out.println(AssortedMethods.stringArrayToString(array));
		Arrays.sort(array, new AnagramComparator());
		System.out.println(AssortedMethods.stringArrayToString(array));
	}
}
