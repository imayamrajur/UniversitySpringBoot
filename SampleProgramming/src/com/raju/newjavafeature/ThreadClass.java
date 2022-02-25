package com.raju.newjavafeature;

public class ThreadClass implements Runnable {
	Thread s = new Thread();
	public void display() throws InterruptedException {
		
		for(int i=0;i<=10;i++) {
			s.wait(5000);
			System.out.println(i);
		}
	}
	@Override
	public void run() {
		try {
			display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
