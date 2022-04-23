package com.cict6thedition.ObjectOrientedDesign.Q706Jigsaw;

public enum Orientation {
	LEFT, TOP, RIGHT, BOTTOM; // Should stay in this order 
	
	public Orientation getOpposite() {
		switch (this) {
			case LEFT: return RIGHT;
			case RIGHT: return LEFT;
			case TOP: return BOTTOM;
			case BOTTOM: return TOP;
			default: return null;
		}
	}
}
