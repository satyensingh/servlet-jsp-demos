package com.training.model;

public class Counter {
	
	private static int counter;
	
	public int getCount() {
		return ++counter;
	}
}
