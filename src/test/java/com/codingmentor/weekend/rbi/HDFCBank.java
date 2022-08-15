package com.codingmentor.weekend.rbi;

public class HDFCBank implements RBI{

	@Override
	public void homeLoanIntrest() {
		System.out.println("hdfc homeLoanIntrest is 7.25%");
	}

	@Override
	public void persoanlLoabIntrest() {
		System.out.println("hdfc persoanlLoabIntrest is 10.25%");
	}

	
}
