package com.raju.inheritanceshierarchical;

public class HierarchicalMain {

	Apple ap;
	int a = 10;
	int b;

	public static void main(String[] args) {
		System.out.println("Banana");
		Banana b = new Banana();
		b.sweet();
		b.skin();
		b.shape();

		System.out.println("Apple");
		Apple a = new Apple();
		a.sweet();
		a.skin();
		a.shape();

		System.out.println("Lemon");

		Lemon l = new Lemon();
		l.Tartness();
		l.skin();
		l.shape();

		int rs = MyInterface.display(10);
		System.out.println(rs);

		

	}

	void call() {
		ap = new Apple();
		ap.shape();
		ap.skin();
		ap.sweet();
		ap.Tartness();
		b = 20;
		System.out.println(a + b);
		runs();
	}

	static void runs() {
		HierarchicalMain hr = new HierarchicalMain();
		hr.call();
		System.out.println("Hi Eswari");
	}

}
