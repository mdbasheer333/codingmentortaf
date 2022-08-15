package com.codingmentor.weekend.exchandling;

import java.io.File;
import java.io.FileInputStream;

public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arithmatic
		
		  int a=10; int b=10; 
		  
			/*
			 * try { System.out.println(a/b); int arr[]= {10,30,20};
			 * System.out.println(arr[3]); } catch (ArithmeticException e) {
			 * System.out.println(" iam arith"); }catch (ArrayIndexOutOfBoundsException e) {
			 * System.out.println(" iam ArrayIndexOutOfBoundsException"); }
			 */
		  
		  try {
			  System.out.println(a/b);
			  int arr[]= {10,30,20};
			  System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println(" iam arith");
		}
		 
		  System.out.println("end of prog");
		 
		
		
		
		
		
	}

}
