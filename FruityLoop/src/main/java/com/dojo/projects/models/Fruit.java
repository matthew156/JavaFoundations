package com.dojo.projects.models;

public class Fruit {
	//ATTRIBUTES
	public String name;
	public double price;
	//CONSTRUCTOR
	public Fruit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	//GETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
