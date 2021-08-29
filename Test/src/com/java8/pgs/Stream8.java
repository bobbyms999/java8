package com.java8.pgs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream8 {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();

		al.add(3);
		al.add(20);
		al.add(3);
		al.add(40);
		al.add(17);

		List<Integer> al1 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(al1);

		List<Integer> al2 = al.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(al2);

		System.out.println(al.stream().count());
		System.out.println(al.stream().filter(l -> l < 20).count());

		List<Integer> al3 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(al3);

		List<Integer> al4 = al.stream().sorted((e1, e2) -> e1 > e2 ? -1 : e1 < e2 ? +1 : 0)
				.collect(Collectors.toList());
		System.out.println(al4);

		List<Integer> al5 = al.stream().sorted((e1, e2) -> -e1.compareTo(e2)).collect(Collectors.toList());
		System.out.println(al5);

		List<String> names = new ArrayList<String>();
		names.add("bobby");
		names.add("sk");
		names.add("mazeed");
		names.add("john");

		Comparator<String> comp = (s1, s2) -> -s1.compareTo(s2);
		names.sort(comp);
		//System.out.println(names);

		List<String> sortNames = names.stream().sorted(comp).collect(Collectors.toList());
		//System.out.println(sortNames);
		
		int i=al.stream().min((e1,e2)->-e1.compareTo(e2)).get();
		//System.out.println(i);
		
		//names.forEach(System.out::println);
		
		String ar[]=names.stream().toArray(String[]::new);
		
		Stream.of(ar).forEach(System.out::println);
		
		
		long count=names.stream().filter(String::isEmpty).count();
		
		
		
		
		
		
		
	}
}
