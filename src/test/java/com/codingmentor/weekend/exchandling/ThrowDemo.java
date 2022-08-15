package com.codingmentor.weekend.exchandling;

public class ThrowDemo {

	public static int devide(int a, int b) throws InterruptedException {
		
		Thread.sleep(3000);
		
		/*
		 * if(b==0) { throw new ArithmeticException("please enter correct value"); }
		 */
		
		return a/b;
	}
	
	
	public static void main(String[] args) throws InterruptedException {

			
		System.out.println(devide(10, 2));
		System.out.println(devide(20, 2));
		System.out.println(devide(30, 0));
		
	}

}
