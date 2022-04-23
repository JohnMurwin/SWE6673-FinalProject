package com.cict6thedition.ObjectOrientedDesign.Q702CallCenter;

public enum Rank {
	Responder (0),
	Manager (1),
	Director (2);
	
	private int value;
	
	private Rank(int v) {
		value = v;
	}
	
	public int getValue() {
		return value;
	}
}
