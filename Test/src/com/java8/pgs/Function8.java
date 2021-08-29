package com.java8.pgs;

import java.util.ArrayList;
import java.util.function.Function;

public class Function8 {

	public static void main(String[] args) {

		Function<Integer, Integer> f = no -> no * no;
		System.out.println(f.apply(10));

		Function<String, Integer> f1 = s -> s.length();
		System.out.println(f1.apply("mazeed"));

		Function<Employee, String> f2 = e -> {
			return e.getId() > 100 ? e.getName() : "";
		};

		ArrayList<Employee> employes = new ArrayList<Employee>();

		employes.add(new Employee(90, "mazeed", 532.5f));
		employes.add(new Employee(102, "sk", 2755.f));
		employes.add(new Employee(92, "shaik", 12544.88f));
		employes.add(new Employee(101, "bobby", 144.88f));

		employes.forEach(e -> {
			System.out.println(e.getId() + "--" + f2.apply(e));
		});

		Function<Integer, String> f3 = i -> {
			return i > 100 ? "mazeed" : "";
		};
		Function<String, Integer> f4 = s -> {
			return s.equals("mazeed") ? 101 : 0;
		};
		System.out.println(f3.andThen(f4).apply(200));

		System.out.println(f3.compose(f4).apply("mazeed"));
		
		// instead type casting mul times use IntFun

	}

}
