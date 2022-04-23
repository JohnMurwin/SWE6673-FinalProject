package com.cict6thedition.Java.Q1306ObjectReflection;

public class Rectangle {
	private double width;
	private double height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double area() {
		return width * height;
	}
}
