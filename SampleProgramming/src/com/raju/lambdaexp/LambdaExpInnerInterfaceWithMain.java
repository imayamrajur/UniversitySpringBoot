package com.raju.lambdaexp;


public class LambdaExpInnerInterfaceWithMain {
	interface Interface1{
		int operations(int a, int b);
	}
	interface Interface2{
		void message(String msg);
	}
	private int operant(int x, int y, Interface1 ints) {
		return ints.operations(x, y);
	}

	public static void main(String[] args) {
		Interface1 add = (int r,int s)->r+s;
		Interface1 sub = (int r,int s)->r-s;
		Interface1 mul = (int r,int s)->r*s;
		Interface1 div = (int r,int s)->r/s;
		Interface1 mod = (int r,int s)->r%s;
		
		LambdaExpInnerInterfaceWithMain lim = new LambdaExpInnerInterfaceWithMain();
		System.out.println("Addition = "+lim.operant(90, 13, add));
		System.out.println("Addition = "+lim.operant(90, 13, sub));
		System.out.println("Addition = "+lim.operant(90, 13, mul));
		System.out.println("Addition = "+lim.operant(90, 13, div));
		System.out.println("Addition = "+lim.operant(90, 13, mod));
		
		Interface2 ifc = message->System.out.println("Hello "+message);
		ifc.message("Raju");
			

	}

}
