package com.example.runnable;
public class FirstRunnable {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("hello, Im running in thread " + Thread.currentThread().getName());
		};
		
		Thread t =new Thread(runnable);
		t.setName("My Thread");
		t.start();
		
		
		
	}

}
