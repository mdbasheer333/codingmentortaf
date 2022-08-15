package com.codingmentor.practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

class MinHeapComparator implements Comparator<Integer> {
	 
    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
     
        // Elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

public class Practice1 {

	public static void main(String[] args) {
		
		
		Integer arr[]= {100, 2,6,7, 5,4,3,10};
		int k=4;
		
		PriorityQueue<Integer> q=new PriorityQueue<>(new MinHeapComparator());
		
		for (int j = 0; j < arr.length; j++) {
			
				q.add(arr[j]);
				
				if(q.size()>k) {
					System.out.println(q.remove());
				}
					
			System.out.println(q);
			
		}
		

		
		System.out.println(q.peek());
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
}
