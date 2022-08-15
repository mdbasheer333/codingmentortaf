package com.codingmentor.weekend.interfacedemo;

public class MyInterImpl implements MyInterface{

	@Override
	public void display() {
		System.out.println("i have implemented display");
	}

	@Override
	public void message() {
		System.out.println("i have implemented message");
	}

	
	public void running() {
		System.out.println("i have running of MyInterImpl");
	}
	
}
