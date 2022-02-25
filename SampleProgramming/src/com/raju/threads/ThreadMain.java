package com.raju.threads;

public class ThreadMain {

	public static void main(String[] args) {
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread -1");
				
			}
		};
		new Thread(t1).start();
		
		Runnable t2= ()->System.out.println("Thread -2");
		new Thread(t2).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread - 3");
				
			}
		}).start();
		
		new Thread(()->{
			System.out.println("Thread - 4");
			System.out.println("Thread - 5");
		}).start();;
	}

}
