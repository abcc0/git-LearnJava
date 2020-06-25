package com.abcc.maven.jrnd;

public class Fruits {
	
	//initialize variables
	String species;
	String colour;
	String origin;
	int quantity;
	double unitprice;
	
	public void showCharacteristics() {
		System.out.println("Speicies: " + species);
		System.out.println("Colour: " + colour);
		System.out.println("Origin: " + origin);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price/Unit: " + unitprice);
		System.out.println("Total Cost: " + quantity * unitprice);
	}
	
	}

