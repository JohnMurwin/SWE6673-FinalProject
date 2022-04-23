package com.cict6thedition.RecursionAndDynamicProgramming.Q813StackofBoxes;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {
	@Override
	public int compare(Box x, Box y){
		return y.height - x.height;
	}
}
