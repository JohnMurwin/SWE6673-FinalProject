package com.cict6thedition.SortingAndSearching.Q1010RankfromStream;

import java.util.Comparator;

public class IntComparable implements Comparator<Integer>{
	 
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}
