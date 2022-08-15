package com.codingmentor.weekend.exchandling;

public class ExcHandling {

	public static void main(String[] args) {

		/*
		 * int a=10; int b=0;
		 * 
		 * try { System.out.println(a/b); }catch(ArithmeticException obj) {
		 * System.out.println("i have handled ArithmeticException " + obj.getMessage());
		 * }
		 * 
		 * System.out.println("end of the prog");
		 */
		
		
//		int arr[]= {20,10,30};
//		
//		try {
//			System.out.println(arr[3]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("i have handled ArrayIndexOutOfBoundsException " + e.getMessage());
//		}
//		
//		System.out.println("end of the prog");
		
		int a=10; int b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("i have handled ArithmeticException");
		}finally {
			System.out.println("i am finally i always get executed");
		}
		
		System.out.println("end of prog");
		
	}

}
