package com.java8.pgs;

import java.util.function.Consumer;

public class Consumer8 {

	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("mazeed");
		
		Consumer<Employee> c1=e->System.out.println(e);
		c1.accept(new Employee(100, "mazeed", 55.5f));
		

	}

}
