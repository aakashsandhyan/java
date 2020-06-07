package com.example.runnable.model;

public class A {
	
	private Object key1 = new Object();
	private Object key2 = new Object();
	
	public void a()
	{
		synchronized (key1) {
			System.out.println("Thread id : " + Thread.currentThread().getName()+ " id:"+ Thread.currentThread().getId() + " running!");
			b();
		}
	}
	
	public void b()
	{
		synchronized (key2) {
			System.out.println("Thread : " + Thread.currentThread().getName() +  " id:"+ Thread.currentThread().getId() + " running!");
			c();
		}
	}
	
	public void c()
	{
		synchronized (key1) {
			System.out.println("Thread : " + Thread.currentThread().getName() +  " id:"+ Thread.currentThread().getId() + " running!");
		}
	}
	

}
