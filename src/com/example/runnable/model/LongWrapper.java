package com.example.runnable.model;

public class LongWrapper 
{
	private long l;
	
	private Object key = new Object();
	
	public LongWrapper(long l)
	{
		this.l=l;
	}
	
	public long getValue()
	{
		return l;
	}
	
	public void increamentValue()
	{
		synchronized (key) {
			l = l+1;
			System.out.println("current thread : " + Thread.currentThread().getName() + "\tValue : " + l);
		}
	}
	
}
