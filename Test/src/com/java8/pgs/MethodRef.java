package com.java8.pgs;

interface Car {
	void make();
}

interface Car1 {
	void make1(String color);
}

class MyClass {
	void construction() {
		System.out.println("cons..");
	}
}

class MyClass1 {
	void construction(String color) {
		System.out.println("cons.." + color);
	}
}

public class MethodRef {

	public static void main(String[] args) {
		// one way
		Car car = () -> {
			System.out.println("hello..");
		};
		car.make();

		// 2nd way

		MyClass cls = new MyClass();
		Car cr = cls::construction;
		cr.make();

		// params
		MyClass1 cls1 = new MyClass1();
		Car1 cr1 = cls1::construction;
		cr1.make1("blue");

	}

}
