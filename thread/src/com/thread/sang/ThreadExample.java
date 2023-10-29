package com.thread.sang;
//import java.util.*;

public class ThreadExample extends Thread {
	
	public void run() {
		System.out.println("Running my thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//job1
		System.out.println("This is my first example");
		//job2
		ThreadExample obj = new ThreadExample();
		obj.start();
		//job3
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println("This is program "+i);	
		}

	}

}
