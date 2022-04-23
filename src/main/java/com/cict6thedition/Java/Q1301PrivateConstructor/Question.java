package com.cict6thedition.Java.Q1301PrivateConstructor;

public class Question {
	private Question() {
		System.out.println("Q");
	}
	
    static class A {
        private A() {
        }
    }

    static class B extends A {
    	public B() {
    	}
    }
    
	public static void main(String[] args) {
		new B();
	}

}
