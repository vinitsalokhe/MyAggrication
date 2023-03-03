package com.xyz;

public class Car {

	String company;
	Engine engine;
	int macking;

	public Car() {
		super();
	}

	public Car(String company, Engine engine, int macking) {
		super();
		this.company = company;
		this.engine = engine;
		this.macking = macking;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", engine=" + engine + ", macking=" + macking + "]";
	}

}
