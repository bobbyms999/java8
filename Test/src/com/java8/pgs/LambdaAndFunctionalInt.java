package com.java8.pgs;

interface I1 {
	void m1();
}

class Impl implements I1 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

}

@FunctionalInterface
interface I2 {
	void m2();
}

@FunctionalInterface
interface I3 {
	void m3(int a, int b);
}

@FunctionalInterface
interface I4 {
	int m4(int a);
}

interface I5 {
	default void m5() {
		System.out.println("I5 m5");
	}
}

class Impl1 implements I5 {

	
}

public class LambdaAndFunctionalInt {

	public static void main(String[] args) {
		// old style
		// I1 i1 = new Impl();
		// i1.m1();

		// new style if single line
		I2 i2 = () -> System.out.println("m2 methods");
		i2.m2();

		// new style if mul line
		I2 i3 = () -> {
			System.out.println("m3 methods");
			System.out.println("m4");
		};
		i3.m2();

		I3 s3 = (a, b) -> System.out.println(a + b);
		s3.m3(10, 20);

		I4 s4 = n -> n * n;
		System.out.println(s4.m4(10));
		
		I5 s5=new Impl1();
		s5.m5();

	}

}
