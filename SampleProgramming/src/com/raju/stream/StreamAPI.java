package com.raju.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		Stream<Integer> streamList = Stream.of(9,5,2,6,8,4,1,3,7);
		//streamList.skip(3).limit(9).forEach(System.out::println);
		
		System.out.println("________________");
		
		
		
		Stream<Integer> list = Stream.iterate(1, n->n+1);
		list.skip(0).limit(50).forEach(System.out::println);
		
		System.out.println("________________");
		List<Integer> li = streamList.collect(Collectors.toList());
		li.stream().filter(a->a>=5).map(a->a*1).forEach(a->System.out.print(" "+a));
		li.stream().filter(a->a<5).collect(Collectors.toList()).forEach(b->System.out.print(" "+b));
		System.out.println("________________");
	int a =	(int)li.stream().filter(b->b%2==1).count();
	int r =	(int)li.stream().count();
	System.out.println("________________");
	System.out.println(a);
	System.out.println("________________");
	System.out.println(r);
	
	/*
	 * //List<Integer> slist = streamList.sorted().collect(Collectors.toList());
	 * 
	 * slist.forEach(s->System.out.print(" "+s+" "));
	 * System.out.println("________________");
	 */
	}

}
