package com.cict6thedition.ObjectOrientedDesign.Q704ParkingLot;

public class Motorcycle extends Vehicle {
	public Motorcycle() {
		spotsNeeded = 1;
		size = VehicleSize.Motorcycle;
	}
	
	public boolean canFitInSpot(ParkingSpot spot) {
		return true;
	}
	
	public void print() {
		System.out.print("M");
	}	
}
