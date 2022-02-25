package com.raju.methods;

import com.raju.maps.College;

public class MethodaEquals {

	public static void main(String[] args) {
		String s = "Raju";
		String s3 = "Raju";
		String s1 = new String("Raju");
		int a=10;
		int b=10;
		Integer h = new Integer(60);
		Integer g = new Integer(60);
		Double k = new Double(50.0);
		Double ks = new Double(30.0);
		Float ft1 = new Float(50.0);
		Float ft2 = new Float(30.0);
		String r = new String();
		String t = new String();
		College c1 = new College(0, t, t);
		College c2 = new College(0, t, t);
		
		char p = 'R';
		String raju = "Sara";
		String sara = new String("Sara");
		Character q = new Character('R');
		System.out.println(raju==sara);
		System.out.println(raju.equals(sara));
		System.out.println(q.hashCode());
		System.out.println(p==q);				
		System.out.println(ft1.equals(k));
		
		System.out.println(ft1.hashCode());
		System.out.println(ft2.hashCode());
		
		System.out.println(k.hashCode());
		System.out.println(ks.hashCode());
		
		System.out.println(h.hashCode());
		System.out.println(g.hashCode());
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(r.hashCode());
		System.out.println(t.hashCode());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(s==s3);
		System.out.println(a==b);
		System.out.println(Integer.valueOf(a).hashCode());
		System.out.println(Integer.valueOf(b).hashCode());

	}

}
