package com.kodewala.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Customer {
	String name;
	int balance;

	public Customer(String name, int bal) {
		this.name = name;
		this.balance = bal;
	}
}

public class ArrayListEx {

	public static void main(String[] args) {
		// List maintains order
		// Can have duplicates
		// Can have multiple null
		ArrayList<String> names = new ArrayList<String>();
		names.add("hello");
		names.add("hello");
		names.add("hello");
		names.add("hello");
		names.add("hello");
		names.add("hello");
		names.add(null);
		names.add(null);
		names.add(null);
		names.add("hello");
		names.add("hello");

		// Check the capacity in debug mode
		ArrayList<Customer> cusArr = new ArrayList<Customer>();

		Customer c1 = new Customer("Gaurav", 500);
		cusArr.add(c1);

		cusArr.add(new Customer("Nayandeep", 94));
		cusArr.add(new Customer("Mohan", 94));
		cusArr.add(new Customer("Mohan", 94));
		cusArr.add(new Customer(null, 0));
		cusArr.add(new Customer(null, 0));
		cusArr.add(new Customer("Nayandeep", 94));
		cusArr.add(new Customer("Mohan", 94));
		cusArr.add(new Customer("Mohan", 94));
		cusArr.add(new Customer(null, 0));
		cusArr.add(new Customer(null, 0));
		cusArr.add(new Customer(null, 0));

		for (Customer c : cusArr) {
			System.out.println(c.name + " " + c.balance);
		}

		System.out.println("");

		List<Customer> cx = Arrays.asList(new Customer("Nayandeep", 94), new Customer("Nayandeep", 94),
				new Customer("Nayandeep", 94));

		for (Customer cus : cx) {
			System.out.println(cus.name + " " + cus.balance);
		}

	}
}
