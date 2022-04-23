package com.cict6thedition.ObjectOrientedDesign.Q702CallCenter;

class Respondent extends Employee {
    public Respondent(CallHandler callHandler) {
    	super(callHandler);
    	rank = Rank.Responder;
    }
}
