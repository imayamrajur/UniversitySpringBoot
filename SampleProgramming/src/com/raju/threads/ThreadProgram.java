package com.raju.threads;

public class ThreadProgram extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new ThreadProgram();
		Thread t2 = new ThreadProgram();
		t.start();
		t2.start();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.currentThread();
			t2.sleep(5000);
			t.getStackTrace();
		}
		
		for(int i=0;i<=10;i++) {
			System.out.println("Hi "+i);
			Thread.currentThread();
			t.sleep(5000);
			t2.getStackTrace();
		}
		t.currentThread();
		t2.currentThread();
		

	}

}
