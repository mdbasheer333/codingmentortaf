package com.codingmentor.weekend.rbi;

public class ICICIBank implements RBI{

	@Override
	public void homeLoanIntrest() {
		System.out.println("ICICIBank homeLoanIntrest is 7.50%");
	}

	@Override
	public void persoanlLoabIntrest() {
		System.out.println("ICICIBank persoanlLoabIntrest is 10.50%");
	}
	
}
