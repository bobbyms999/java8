package com.java8.pgs;

import java.util.Optional;

public class Optional8 {

	public static void main(String[] args) {

		String s = null;
		//System.out.println(s.length());

		Optional<String> opt = Optional.ofNullable(s);
		String name = opt.isPresent() ? opt.get() : "value is null";
		System.out.println(name);
		
		
		Optional<String> opt1 = Optional.ofNullable("mazeed");
		
		
		
		
		
		
		
		

	}

}
