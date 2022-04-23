package com.cict6thedition.ObjectOrientedDesign.Q702CallCenter;

class Manager extends Employee {
    public Manager(CallHandler callHandler) {
    	super(callHandler);
    	rank = Rank.Manager;
    }
}
