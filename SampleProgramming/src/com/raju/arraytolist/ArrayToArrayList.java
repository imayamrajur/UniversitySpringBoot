package com.raju.arraytolist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String names[] = { "Raju", "Sara", "Susi" };
		String nt[] = new String[4];
		nt[0] = "Java";
		nt[1] = "Spring";
		nt[2] = "MySQL";
		nt[3] = "C pro";

		List<String> list = Stream.of(nt).collect(Collectors.toList());
		list.forEach(a -> System.out.println(a));
		System.out.println("******---*********");
		List<String> li = Arrays.asList(nt);
		li.forEach(a -> System.out.println(a));
		System.out.println("***************");
		List<String> lists = Stream.of(names).collect(Collectors.toList());
		lists.forEach(a -> System.out.println(a));
		System.out.println("*******____********");
		List<String> sorts = list.stream().sorted().collect(Collectors.toList());
		sorts.forEach(a -> System.out.println(a));

		System.out.println("*******____********");
		List<String> sortRe = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		sortRe.forEach(a -> System.out.println(a));

		System.out.println("*******____********");
		List<String> sortNt = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		sortNt.forEach(a -> System.out.println(a));

	}

}
