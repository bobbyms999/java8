package com.java8.pgs;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

interface PreI1 {
	void find(int i);
}

class EvenImpl implements PreI1 {

	@Override
	public void find(int i) {
		if (i % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}

public class Predicate8 {

	public static void main(String[] args) {
		// if u want even no
		PreI1 i1 = new EvenImpl();
		i1.find(9);

		// if u use predicate its easy

		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10));

		Predicate<Employee> pe1 = e -> e.getId() > 100 && e.getName().equals("bobby");
		System.out.println(pe1.test(new Employee(101, "bobby", 856.5f)));

		String s[] = new String[] { "sk", "bobby", "a", "john" };
		Predicate<String> ss = (name) -> name.length() > 3;

		Arrays.stream(s).forEach(name -> {
			if (ss.test(name)) {
				System.out.println("yes " + name);
			}
		});

		// predicate and or negate=not that no

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2, 12, 13, 14, 15 };

		Predicate<Integer> p3 = no -> no % 2 == 0;
		Predicate<Integer> p4 = no -> no > 10;
		Predicate<Integer> p5 = no -> no == 10;

		Arrays.stream(arr).forEach(no -> {
			if (p3.and(p4).test(no)) {
				// System.out.println("No " + no);
			}
			if (p5.negate().test(no)) {
				System.out.println("No " + no);
			}
		});

		// instead type casting mul times use IntPre
		IntPredicate p = no -> no % 2 == 0;
		System.out.println(p.test(9));

	}

}
