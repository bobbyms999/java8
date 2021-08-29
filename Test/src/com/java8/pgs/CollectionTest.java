package com.java8.pgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId() > o2.getId() ? 1 : o1.getId() < o2.getId() ? -1 : 0;
	}

}

public class CollectionTest {

	public static void main(String[] args) {

		ArrayList<Employee> employes = new ArrayList<Employee>();

		employes.add(new Employee(100, "mazeed", 532.5f));
		employes.add(new Employee(102, "sk", 2755.f));
		employes.add(new Employee(103, "shaik", 12544.88f));
		employes.add(new Employee(101, "bobby", 144.88f));
		// old style
		System.out.println("Before " + employes);
		Collections.sort(employes, new EmployeeComp());
		// System.out.println("After " + employes);

		//
		Comparator<Employee> comp = (o1, o2) -> o1.getId() > o2.getId() ? 1 : o1.getId() < o2.getId() ? -1 : 0;
		Collections.sort(employes, comp);
		System.out.println("After java 8 ids" + employes);

		Comparator<Employee> comp1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(employes, comp1);
		System.out.println("After java 8 names" + employes);

		Comparator<Employee> comp2 = (o1, o2) -> o1.getSalary() > o2.getSalary() ? 1
				: o1.getSalary() < o2.getSalary() ? -1 : 0;
		Collections.sort(employes, comp2);
		System.out.println("After java 8 salary" + employes);
		
		
		
		System.out.println("change for master");
		System.out.println("change from develop");

	}

}
