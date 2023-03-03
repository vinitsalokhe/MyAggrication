package com.xyz;

public class TestDemo {

	public static void main(String[] args) {

		Engine e = new Engine(22, 12.12f, 4);
		Car c = new Car("Suzuki", e, 2020);
		System.out.println(c);

		Engine e1 = new Engine(23, 87.1f, 2);
		Car c1 = new Car("Honda", e1, 2021);
		System.out.println(c1);
	}

}
