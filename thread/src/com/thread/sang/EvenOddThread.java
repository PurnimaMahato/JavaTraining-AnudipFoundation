//Q.1)WAP to create threads to find even numbers between 1 to 20 and other thread to print odd numbers between 1 to 20.
package com.thread.sang;
//  Creating threads By Extending To Thread classes
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd number: " + i);
        }
    }
}
//Main class
public class EvenOddThread {
	
	public static void main(String[] args) {
		// Create two threads, one for even numbers and one for odd numbers
        EvenThread even = new EvenThread();
        OddThread odd= new OddThread();

        // Start the threads
        even.start();
        odd.start();

	}

}
