package com.java8.pgs;

import java.util.Date;
import java.util.function.Supplier;

public class Suplier8 {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());

		

	}

}
