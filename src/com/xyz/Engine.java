package com.xyz;

public class Engine {

	int taurque;
	float capasity;
	int numberOfCylinder;

	public Engine() {
		super();
	}

	public Engine(int taurque, float capasity, int numberOfCylinder) {
		super();
		this.taurque = taurque;
		this.capasity = capasity;
		this.numberOfCylinder = numberOfCylinder;
	}

	@Override
	public String toString() {
		return "Engine [taurque=" + taurque + ", capasity=" + capasity + ", numberOfCylinder=" + numberOfCylinder + "]";
	}

}
