package com.codingmentor.weekend.interfacedemo;

public class IntefaceDemo {

	public static void main(String[] args) {

		// we cant create/intiatiaze for interfcae
		//MyInterface obj1=new MyInterface();
		
		MyInterImpl obj=new MyInterImpl();
		obj.display();
		obj.message();
		obj.running();
		
	
	}

}
