package com.cict6thedition.ObjectOrientedDesign.Q702CallCenter;

class Director extends Employee {
    public Director(CallHandler callHandler) {
    	super(callHandler);
    	rank = Rank.Director;
    }
}
