package com.xyz;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);

		Address a1 = new Address("Pune", "India", 400113);
		Address a2 = new Address("Kolhapur", "India", 416200);

		Address[] xyz = { a1, a2 };

		Student s1 = new Student(1, "Ram", xyz);
		System.out.println(s1);
	}
}
