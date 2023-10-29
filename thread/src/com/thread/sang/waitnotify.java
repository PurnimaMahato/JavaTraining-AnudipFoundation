package com.thread.sang;

class customer
{
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw....");
		
		if(this.amount<amount)
		{
			System.out.println("Less balance ; waiting for deposit....");
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		this.amount = this.amount-amount;
		System.out.println("Withdraw completed.....");
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit.....");
		this.amount = this.amount+amount;
		System.out.println("Deposite completed.....");
	}
}

public class waitnotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c = new customer();
		new Thread()
		{
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run() {
				c.deposit(10000);
			}
		}.start();
		

	}

}
