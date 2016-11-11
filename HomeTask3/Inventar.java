package com.geekhub.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventar {

	private static ArrayList<Product> products;

	private String userInput = "anything";

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public String getUserInput() {
		return this.userInput;
	}

	public void productSumm(ArrayList<Product> products) {

		int summ = 0;

		for (int i = 0; i < products.size(); i++) {
			System.out.println("Product name: " + products.get(i).getName() + ". Quantity: "
					+ products.get(i).getQuantityOnHand() + ".");
			summ = summ + products.get(i).getQuantityOnHand();
		}
		System.out.println("Products quantity is: " + summ);
	}

	public void addProduct() {

		Product product = new Product();

		System.out.println("Add product name: ");
		Scanner scan = new Scanner(System.in);
		setUserInput(scan.nextLine());
		product.setName(userInput);

		System.out.println("Add product price: ");
		setUserInput(scan.nextLine());
		int userInputInt = Integer.parseInt(userInput);
		product.setPrice(userInputInt);

		System.out.println("Add product quantity: ");
		setUserInput(scan.nextLine());
		userInputInt = Integer.parseInt(userInput);
		product.setQuantityOnHand(userInputInt);
		products.add(product);
	}

	public void createInventarWithProducts() {

		products = new ArrayList<>();

		Product product1 = new Product("milk", 15, 12);
		products.add(product1);

		Product product2 = new Product("bread", 2, 10);
		products.add(product2);

		Product product3 = new Product("juce", 10, 10);
		products.add(product3);
	}

	public void startProgram() {

		createInventarWithProducts();

		boolean x = false;

		while (x == false) {
			System.out.println("Input 'add' if you want to add some products or 'exit' if you want to quit.");
			Scanner scan = new Scanner(System.in);
			setUserInput(scan.nextLine());

			switch (getUserInput()) {
			case "add":
				addProduct();
				productSumm(products);
				break;
			case "exit":
				System.out.println("Good Luck!");
				x = true;
			default:
			}
		}
	}
}
