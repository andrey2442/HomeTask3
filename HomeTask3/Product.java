package com.geekhub.homework;

public class Product {

	private String name;
	private int price;
	private int quantityOnHand;

	public Product(String name, int price, int quantityOnHand) {
		this.name = name;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
	}

	public Product() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getQuantityOnHand() {
		return this.quantityOnHand;
	}
	
}
