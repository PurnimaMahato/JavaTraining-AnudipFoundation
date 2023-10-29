//Q.2)WAP to implement thread lifecycle. 
package com.thread.sang;
//Creating thread By Extending To Thread classe
class MyThread1 extends Thread{
	public void run() {
		System.out.println("Thread is running.");
		synchronized(ThreadStatesExample.class)
		{
			try{ 
				Thread.sleep(2000);
				ThreadStatesExample.class.wait();
			}
			catch(InterruptedException e){ 
			e.printStackTrace();
			}			
		}
		System.out.println("Thread is awake.");	
	}
	
}
//Main class
public class ThreadStatesExample {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 thread = new MyThread1();
		System.out.println("Thread State: " + thread.getState()); // New
		thread.start();
		System.out.println("Thread State: " + thread.getState()); // Runnable
		Thread.sleep(1000);
		System.out.println("Thread State: " + thread.getState()); // Timed_Waiting
		synchronized(ThreadStatesExample.class)
		{
			ThreadStatesExample.class.notify();
		}
		Thread.sleep(1000);
		System.out.println("Thread State: " + thread.getState());//Terminated
		
	}

}
