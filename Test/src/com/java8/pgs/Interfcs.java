package com.java8.pgs;

interface i8 {
	void m1();
}

interface i9 {
	void m1();
}

class Impl6 implements i8, i9 {

	@Override
	public void m1() {
		System.out.println("impl");

	}

	
}

public class Interfcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
