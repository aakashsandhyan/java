package com.example.runnable;

import com.example.runnable.model.LongWrapper;

public class RaceCondition {

	public static void main(String args[]) throws InterruptedException {
		
			LongWrapper longWrapper = new LongWrapper(0L);
			
			Runnable r = () -> {
				
				for(long i=0L;i<1000L; ++i)
				{
					longWrapper.increamentValue();
				}
			};
	
			Thread[] threads = new Thread[1000];
			
			for(int i=0;i<threads.length;i++)
			{
				threads[i] = new Thread(r);
				threads[i].start();
			}
			
			for(int i=0;i<threads.length;i++)
			{
				threads[i].join();
			}
			
			System.out.println("value = " + longWrapper.getValue());
			
			
	}
}
